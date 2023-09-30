package com.marolix.objectclass;

public class FinaliseMethod 
{
public static void main(String[] args) {
	
	FinaliseMethod f1=new FinaliseMethod();
	//System.out.println(f1.hashCode());
	f1=null;
	System.gc();
	System.out.println("End of garbage collection");
	
}

@Override
protected void finalize() {
System.out.println("Finalize method called");
System.out.println(10/0);
}
}
