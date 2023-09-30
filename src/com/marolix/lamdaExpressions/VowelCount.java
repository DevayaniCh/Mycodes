package com.marolix.lamdaExpressions;
@FunctionalInterface
public interface VowelCount 
{
	void countvowels();
}
class Vowel implements VowelCount
{
	@Override
	public void countvowels() {
		VowelCount l1= ()->{
			String s="Deeevaaayaniiiii";
			int Acount=0,eCount=0,ICount=0,oCount=0,uCount=0;
			  for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch=='a') 
				{	
				Acount++;
				}
				else if(ch=='e'){
					eCount++;
				}
				else if(ch=='i'){
					ICount++;
				}
				else if(ch=='o'){
					oCount++;
				}
				else if(ch=='u'){
					uCount++;
				}	
			}
			  System.out.println("A's in a String  "+Acount);
			  System.out.println("E's in a String  "+eCount);
			  System.out.println("I's in a String  "+ICount);
			  System.out.println("0's in a String  "+oCount);
			  System.out.println("u's in a String  "+uCount);
		};
	l1.countvowels();
}
public static void main(String[] args) {
	Vowel v= new Vowel();
	v.countvowels();
}
}

