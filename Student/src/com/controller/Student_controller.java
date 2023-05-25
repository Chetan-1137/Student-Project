package com.controller;

import java.util.ArrayList;
import java.util.Iterator;

import com.modern.Student;
import com.service.Student_data;

public class Student_controller {
	void Detai() {
		Student_data ss=new Student_data() ;
	   ArrayList<Student>Detail=ss.data();
	   for (Student student : Detail) {
		System.out.println(student);
	}
	}
	  void name() { 
		  Student_data sm=new Student_data() ;
		   ArrayList<Student>data=sm.condtion();
		
	   for (Student student : data) {
		System.out.println(student.getName());
	System.out.println("******deparment of BCA******");
		
	}
	   
	}
	  void Deparment() {
		  Student_data m2=new Student_data() ;
		   ArrayList<Student>data=m2.deparment();
		   
		    for (Student student : data) {
				System.out.println(student.getName());
			}System.out.println("****Only nagpur city student******");
	  }
	  
	  void city() {
		  Student_data m3=new Student_data() ;
		   ArrayList<Student>data=m3.City();
		   
		   for (Student student : data) {
			System.out.println(student.getName());
		}System.out.println("****only MIT College Student******");
		  
	  }
	  void college() {
		Student_data m4=new Student_data() ;
	   ArrayList<Student>data=m4.college();
	   
	   for (Student student : data) {
		   System.out.println(student.getName());
		
	}System.out.println("****only those student mob num  *****");
	   
		  
	  }
	  void mob() {
		  Student_data m5=new Student_data() ;
		   ArrayList<Student>data=m5.mob();
		   
		   for (Student student : data) {
		   System.out.println(student.getMob());
		   }
		   System.out.println("**** only BCA Student College Name  And mob num*****");
	  }
	  void id() {
		  Student_data m5=new Student_data() ;
		  ArrayList<Student>data=m5.Id_name();
		  
		  for (Student student : data) {
			  System.out.println(student.getId());
			  System.out.println(student.getName());
			  System.out.println(student.getCollege_name());
		  }
		  System.out.println("**** only Student lenth 5 Char *****");
	  }
	  
	  void chars() {
		  Student_data m5=new Student_data() ;
		  ArrayList<Student>data=m5.chara();
		  
		  for (Student student : data) {
			  
			  System.out.println(student.getName());
			 		  }
		  System.out.println("****those student belong city Chalisgaon and Khandala  *****");
	  }
	  
	  void citys() {
		  Student_data m5=new Student_data() ;
		  ArrayList<Student>data=m5.location();
		  
		  for (Student student : data) {
			  
			  System.out.println(student.getName());
			  System.out.println(student.getCity());
		  }
		  System.out.println("****  *****");
	  }
	  void cit() {
		  Student_data m5=new Student_data() ;
		  ArrayList<Student>data=m5.locations();
		  
		  for (Student student : data) {
			  
			  System.out.println(student.getName());
			  System.out.println(student.getCity());
		  }
		  System.out.println("****  *****");
	  }
	  
	public static void main(String[] args) {
		Student_controller ff=new Student_controller();
		ff.name();
	
		Student_controller sf=new Student_controller();
		sf.Deparment();
		
		Student_controller dg=new Student_controller();
		dg.city();
		
		Student_controller dm=new Student_controller();
		dm.college();
		
		Student_controller dn=new Student_controller();
		dn.mob();
		
		Student_controller kk=new Student_controller();
		kk.id();
		
		
		Student_controller ch=new Student_controller();
		ch.chars();
		
		Student_controller c=new Student_controller();
		c.citys();
		
		Student_controller cs=new Student_controller();
		cs.cit();
		
	}
}
