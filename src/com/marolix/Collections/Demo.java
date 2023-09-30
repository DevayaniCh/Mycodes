package com.marolix.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Demo 
{
public static void main(String[] args) {
	List<String> list =new ArrayList<String>();
	list.add("dev");
	System.out.println(list);
	List<Integer> list1=new LinkedList<Integer>();
	list1.clear();
	System.out.println(list1);
	List<Double> list2=new Vector<Double>();
    list2.add(100.8);
    System.out.println(list2);
    List<Long> list3=new Stack<Long>();
    list3.add(100l);
    list3.add(101l);
    System.out.println(list3);
}
}
