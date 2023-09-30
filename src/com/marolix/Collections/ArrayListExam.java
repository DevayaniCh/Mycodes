package com.marolix.Collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ArrayListExam 
{
public static void main(String[] args) {
	//linked lst and array list both follows insertion order
	//linkedlist is for insertiona nd deletion
	//arraylist is for retrieving or selection purpose
	LinkedList al=new LinkedList();
	al.add(10);
	al.add("20");
	al.add('a');
	long lStartTime = new Date().getTime();
	System.out.println(lStartTime);
	
	Object al1=al.get(2);
	Object all1=al.set(1, 'b');
	System.out.println(all1);
	long lEndTime = new Date(). getTime();
	System.out.println(lEndTime);
	
	ArrayList all=new ArrayList();
	all.add(10);
	all.add("20");
	all.add('a');
	long lStartTime1 = new Date().getTime();
	System.out.println(lStartTime1);
	
	Object al2=all.get(2);
	Object all2=al.set(1, 'b');
	System.out.println(all2);
	long lEndTime2 = new Date(). getTime();
	System.out.println(lEndTime2);
}
}
