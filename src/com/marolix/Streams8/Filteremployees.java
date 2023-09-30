package com.marolix.Streams8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MarolixEmployees{
	Integer emplId;
	String name;
	LocalDate doj;
	@Override
	public String toString() {
		return "MarolixEmployees [emplId=" + emplId + ", name=" + name + ", doj=" + doj + "]";
	}
	public MarolixEmployees(Integer emplId, String name, LocalDate doj) {
		super();
		this.emplId = emplId;
		this.name = name;
		this.doj = doj;
	}
}
public class Filteremployees 
{
	public static void filter() {
		List<MarolixEmployees> l=new ArrayList<MarolixEmployees>();
		l.add(new MarolixEmployees(1, "dev", LocalDate.of(2023, 4, 12)));
		l.add(new MarolixEmployees(2, "deva", LocalDate.of(2023, 2, 15)));
		l.add(new MarolixEmployees(3, "devaya", LocalDate.of(2023, 1, 10)));
		l.add(new MarolixEmployees(4, "devayani", LocalDate.of(2023, 3, 10)));
		Stream<MarolixEmployees> StreamEmpl=l.stream();
		StreamEmpl=StreamEmpl.filter(e->e.doj.isAfter(LocalDate.of(2023, 2, 14)));
		Stream<MarolixEmployees> StreamEmpId=StreamEmpl.map(emp-> new MarolixEmployees(emp.emplId, emp.name, emp.doj));
		
		StreamEmpId.forEach(System.out::println);
	}
public static void main(String[] args) {
	filter();
}
}
