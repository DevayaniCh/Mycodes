package com.marolix.blocks;
class Block{
	Integer j;
	static String s;
	static {
		System.out.println("Another class Static block-6");
	}
}
public class BlockDemo2 extends Block
{
	Float f;
	static Integer i;
	
	public BlockDemo2() {
		System.out.println("Constructor");
	}
	
static {
	System.out.println("static block 1");
	System.out.println(i);

}
{
	System.out.println("instance block 1");
	System.out.println(i);
}
{
	System.out.println("instance block 2");
	System.out.println(i);
}
{
	System.out.println(i+" instance 3");
}
public static void main(String[] args) {
	BlockDemo2 b=new BlockDemo2();
	BlockDemo2 b1=new BlockDemo2();
	System.out.println("main method");
	//System.out.println(Block.f1);
	System.out.println(b1.f);
}
}
