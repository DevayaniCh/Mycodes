package com.marolix.Streams8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedDemo2 
{
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	final List<Integer> sortedList=new ArrayList<Integer>();
	for(int i=0;i<10;i++) {
		int a=(int)(Math.random()*10);
		l.add(a);
	}
	System.out.println(l);
	//default sorting order wih comparable interface
	//l.stream().sorted().forEach(i->sortedList.add(i));
	//customised sorting order comparator interface
	//compare()
	Comparator<Integer> c=(x,y)-> -x.compareTo(y);
	l.stream().sorted().forEach(i -> sortedList.add(i));

	System.out.println(sortedList);
}
}
