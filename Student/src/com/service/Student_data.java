package com.service;

import java.util.ArrayList;

import com.Dao.StudentDao;
import com.controller.Student_controller;
import com.modern.Student;

public class Student_data {
public	ArrayList<Student>data() {
		StudentDao detail=new StudentDao();
		ArrayList<Student>data=detail.getstudent();
			return data;
}		
		public ArrayList<Student> condtion() {
			
				StudentDao detail=new StudentDao();
				ArrayList<Student>data=detail.getstudent();
				
				ArrayList<Student> al=new ArrayList<>();
				
				for (Student student :data) {
					
				if(student.getName()=="chetan") {
					al.add(student);
				}}
				
				return al;
				}
		
		
		public ArrayList<Student> deparment() {
			
					 StudentDao dept=new StudentDao();
					 ArrayList<Student>data=dept.getstudent();
					 
					 ArrayList<Student>Pl=new ArrayList<>();
					 
					 for (Student student :data) {
						if(student.getDeparment()=="BCA") {
							Pl.add(student);
							
						}
					}
				 return Pl;
				}
	public ArrayList<Student> City() {
				 StudentDao city=new StudentDao();
				 ArrayList<Student>data=city.getstudent();
				 
				ArrayList<Student>Pu=new ArrayList<>();
				 
				for (Student student : data) {
					if(student.getCity()=="nagpur"){
					Pu.add(student);
				
				}
					}
	return Pu;
						
			}	 
public	ArrayList<Student>  college() {
		 StudentDao college=new StudentDao();
		 ArrayList<Student>data=college.getstudent();
		 
		 ArrayList<Student>ml=new ArrayList<>();
		 
		 for (Student student : data) {
			 if(student.getCollege_name()=="M.I.T") {
				 ml.add(student);
			 }
			
		}
		 return ml;
		
	}
  public ArrayList<Student> mob() {
	StudentDao mob=new StudentDao();
	 ArrayList<Student>data=mob.getstudent();
	 
	 ArrayList<Student>h1=new ArrayList<>();
	 
	 for (Student student : data) {
		 if(student.getMob()>9) {
			 h1.add(student);
		 }
		
	}
	 return h1;
}
  
  public ArrayList<Student> chara() {
		StudentDao mob=new StudentDao();
		 ArrayList<Student>data=mob.getstudent();
		 
		 ArrayList<Student>h1=new ArrayList<>();
		 
		 for (Student student : data) {
			 String s=student.getName();
			 if(s.length()<=5) {
				 h1.add(student);
			 }
			
		}
		 return h1;
	}
	  
  
  public	ArrayList<Student>  Id_name() {
		 StudentDao college=new StudentDao();
		 ArrayList<Student>data=college.getstudent();
		 
		 ArrayList<Student>ml=new ArrayList<>();
		 
		 for (Student student : data) {
			 if(student.getDeparment()=="BCA") {
				 ml.add(student);
			 }
			
		}
		 return ml;
	
}
  public	ArrayList<Student>  location() {
	  StudentDao college=new StudentDao();
	  ArrayList<Student>data=college.getstudent();
	  
	  ArrayList<Student>ml=new ArrayList<>();
	  
	  for (Student student : data) {
		  if(student.getCity()=="Chalisgaon" || student.getCity()=="kandala") {
			  ml.add(student);
		  }
		  
	  }
	  return ml;
	  
  }
  public	ArrayList<Student>  locations() {
	  StudentDao college=new StudentDao();
	  ArrayList<Student>data=college.getstudent();
	  
	  ArrayList<Student>ml=new ArrayList<>();
	  
	  for (Student student : data) {
		  if(student.getCity()!="Chalisgaon" || student.getCity()!="kandala") {
			  ml.add(student);
		  }
		  
	  }
	  return ml;
	  
  }
}
 