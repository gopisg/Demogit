package org.college;
public class College
{
private void collegeName() 
{
System.out.println("The College Name is:SVCE");	
}
private void collegeCode()
{
System.out.println("The College Code is:2525");	
}
private void collegeRank() 
{
	System.out.println("The College Rank is:1221");	
}
public static void main(String[]args)
{
	College c=new College();
	Student s=new Student();
	Hostel h=new Hostel();
	Dept d=new Dept();
	c.collegeCode();
	c.collegeName();
	c.collegeRank();
	s.studentId();
	s.studentName();
	s.studentDept();
	h.hostelName();
	d.deptName();
	
}
}


