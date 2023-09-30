package com.marolix.blocks;
public class BlocksDemo 
{
	Integer a;
	static Integer b;

	BlocksDemo() {
		System.out.println("this is constructor no arg-8");
	}

	{
		System.out.println("my wish i dont follow syntax-12");
	}
static {//1

System.out.println("this is static block 1-16");
		System.out.println(b+"17");
	}

	{
		System.out.println("this is instance block 1-21");
	}

	void m1() {
		this.a = 20;
	}

	public static void main(String[] args) {

		BlocksDemo s = new BlocksDemo();
		BlocksDemo s1 = new BlocksDemo();
		System.out.println("i am main method of no use-32");
		s.m1();
		s1.m1();
	}

	static {
		System.out.println("this is static block 2-38");
	}

	{
		System.out.println(b+"-42");
		System.out.println("this is instance block 2-43");
	}
}
