package com.marolix.Streams8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo 
{
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<Integer>();
	for(int i=0;i<10;i++) {
		l1.add(i);
	}
	System.out.println(l1);
	Stream<Integer> s=l1.stream().filter((f)->{
		System.out.println(f);
    return f%2==0;
});
	s.forEach((p)->{
		System.out.println(p);
	});
}
}
