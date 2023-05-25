package com.Dao;

import java.util.ArrayList;

import com.modern.Student;

public class StudentDao {
public	ArrayList<Student> getstudent() {
		Student aa=new Student("chetan","Dy_patil","Chalisgaon","BCA",902231792,45162144);
		Student ab=new Student("Sopan","R.C.patel","Chalisgaon","BCA",915653489,45162144);
		Student ac=new Student("Kurshana","M.I.T","jalna","B.tech",15555701,45162144);
		Student ad=new Student("Suadam","Ssm","beed","Bcs",945176214,45521144);
		Student ae=new Student("Mayur","Dmcs","kandala","B.E",454524444,451154644);
		Student af=new Student("Partik","CSPa","nagpur","C.A",945176147,45142144);
		Student ah=new Student("Gopal","RSCE","kandala","B.A",414217892,4516144);
		Student ai=new Student("Soham","KKGB","kolahpur","MCA",901452445,45162444);
		Student aj=new Student("Mahesh","KHGB","kandala","BCA",904114521,45144144);
		Student ak=new Student("Parshant","Sgdv","Akola;","MBA",902231445,45462144);
		Student am=new Student("shubham","NSGu","yevatmal","MBA",945145214,45141144);
		 
	ArrayList<Student>data=new ArrayList<>();
		data.add(aa);
		data.add(ab);
		data.add(ac);
		data.add(ad);
		data.add(ae);
		data.add(af);
		data.add(ah);
		data.add(ai);
		data.add(aj);
		data.add(ak);
		data.add(am);
		  
		return data;
		
	}

}
