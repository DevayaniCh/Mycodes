package com.marolix.Streams8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Map_Filter_Methods 
{
public static void main(String[] args) {
	List<String> stringList=new ArrayList<String>();
	String s="I am devayani i am java developer";
	String ss[]=s.split(" ");
	for(String sss:ss) {
		stringList.add(sss);
	}
	System.out.println(stringList);
	Stream<String> stringstream=stringList.stream();
	stringstream=stringstream.map(s1->s1.toLowerCase()).filter(t->t.length()>3);
		stringstream.forEach(System.out::println);
	}
}

