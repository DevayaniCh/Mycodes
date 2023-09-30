package com.marolix.modifiers1;

final class FinalDemo //cannot extend
{
public static void main(String[] args) {
	final int i=10;
	//i=20;cannot re-assign
}
public final void demo() {
	System.out.println("demo is loading");
}
//public  void demo() {
//	System.out.println("");
//}//cannot override
}
 