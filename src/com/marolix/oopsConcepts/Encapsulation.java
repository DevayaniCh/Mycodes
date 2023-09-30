package com.marolix.oopsConcepts;

import java.time.LocalDate;

public class Encapsulation 
{
private int id;
private String name;
private LocalDate date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
	//System.out.println(id);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}

}
