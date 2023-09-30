package com.marolix.Streams8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Prtise1<T> 
{
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(0);l.add(10);l.add(20);l.add(5);l.add(15);l.add(25);
	System.out.println(l);
	List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l1);
	
	List<String> l2=new ArrayList<String>();
	l2.add("dev");l2.add("deva");l2.add("devayani");
	System.out.println(l2);
	List<String> s2=l2.stream().filter(s->s.matches(s)).collect(Collectors.toList());
	System.out.println(s2);
}
}
