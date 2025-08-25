package core;

public class Student {
 public int regno;
 public String studentname;
 public double sub1;
 public double sub2;
 public double sub3;

public Student() {
	
}
public Student(int regno, String studentname, double sub1, double sub2, double sub3) {
	super();
	this.regno = regno;
	this.studentname = studentname;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
	
}
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public double getSub1() {
	return sub1;
}
public void setSub1(double sub1) {
	this.sub1 = sub1;
}
public double getSub2() {
	return sub2;
}
public void setSub2(double sub2) {
	this.sub2 = sub2;
}
public double getSub3() {
	return sub3;
}
public void setSub3(double sub3) {
	this.sub3 = sub3;
}
public double getTotal() {
	return sub1+ sub2+ sub3; 
}
public double getAverage() {
	return getTotal()/3.0;
	
}
 
 public String getResult() {
	 if(sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {
		 return "pass";
	 }
	 else {
		 return "fail";
	 }
 }


}
