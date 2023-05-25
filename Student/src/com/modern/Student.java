package com.modern;

public class Student {
private	String name;
private	String college_name;
private	String City;
private	String Deparment;
private	int mob;
private	int id;
public  String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCollege_name() {
	return college_name;
}
public void setCollege_name(String college_name) {
	this.college_name = college_name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getDeparment() {
	return Deparment;
}
public void setDeparment(String deparment) {
	Deparment = deparment;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Student [name=" + name + ", college_name=" + college_name + ", City=" + City + ", Deparment=" + Deparment
			+ ", mob=" + mob + ", id=" + id + "]";
}
public Student(String name, String college_name, String city, String deparment, int mob, int id) {
	super();
	this.name = name;
	this.college_name = college_name;
	City = city;
	Deparment = deparment;
	this.mob = mob;
	this.id = id;
}
	public Student() {}
	
		
	

}
