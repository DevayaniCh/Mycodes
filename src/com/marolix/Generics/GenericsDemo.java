package com.marolix.Generics;

public class GenericsDemo<T>
{
	public void run(T a) {
		System.out.println(a);
	}
public static void main(String[] args) {
	GenericsDemo<Integer> g=new GenericsDemo<Integer>();
	g.run(10);//?-->wildcard generics
	//g.run('a');
}
}
