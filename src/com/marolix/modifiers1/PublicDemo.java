package com.marolix.modifiers1;

public class PublicDemo {
public static void demo(){
	System.out.println("Run the demo");
}
	public static void main(String[] args) {
		com.marolix.modifiers2.PublicDemo2.demo2();
		demo();
	}

}
