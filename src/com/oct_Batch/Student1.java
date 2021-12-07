package com.oct_Batch;

public class Student1 extends College{
	
@Override
public void studentName() {
	super.studentName();
}
@Override
	public void studentDept() {
		super.studentDept();
	}


@Override
	public void studentMark() {
		super.studentMark();
	}
public static void main(String[] args) {
	
	Student1 m =  new Student1();
	m.studentName();
	m.studentMark();
	m.studentDept();
}

}
