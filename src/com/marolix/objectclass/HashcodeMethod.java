package com.marolix.objectclass;

public class HashcodeMethod 
{
public static void main(String[] args) {
	String s="devayni";
	String s1="devayan";
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(System.identityHashCode(s));
	
	if(s==s1) {
		System.out.println("Hashcodes connected");
	}
	else {
		System.out.println("Hashcodes not connected");
	}
}
class abc{
public native int hashcode();
}

class def{
public int hashcode()
{
	return 1;
}
}
class mno{
public int hashcode() {
	return 1;
}
}

}

