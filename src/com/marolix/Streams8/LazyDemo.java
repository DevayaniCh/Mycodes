package com.marolix.Streams8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Emply{
	Integer empId;
	String name;
	String Phone;
	@Override
	public String toString() {
		return "Emply [empId=" + empId + ", name=" + name + ", Phone=" + Phone + "]";
	}
	public Emply(Integer empId, String name, String phone) {
		super();
		this.empId = empId;
		this.name = name;
		Phone = phone;
	}
}
public class LazyDemo 
{
public static void main(String[] args) {
	List<Emply> l=new ArrayList<Emply>();
	l.add(new Emply(1, "dev", "6300431105"));
	l.add(new Emply(2, "deva", "6300431106"));
	l.add(new Emply(3, "devaya", "6300431107"));
	l.add(new Emply(4, "devayan", "6300431108"));
	l.add(new Emply(5, "devayani", "6300431109"));
	System.out.println(l);
	Stream<Emply> s=l.stream();
	//s.forEach(System.out::print);
s.map((e)->{
	System.out.println(e);
	return e.Phone;
}).forEach((p)->{
	System.out.println(p);
});
}
}
