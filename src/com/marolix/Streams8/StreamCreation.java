package com.marolix.Streams8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation 
{
public static void main(String[] args) {
	List<Integer> ll= new ArrayList<Integer>();
	for(int i=0;i<10;i++) {
		ll.add(i);
		
	}
	System.out.println(ll);
	Stream<Integer> s=ll.stream();
	//Stream<Integer> ps=ll.parallelStream();
	s.forEach(System.out::print);
}
}
