package com.example.juse;

public class Student {
	
	private String name;
	
	private String age;
	
	public Student(String name , String age){
		this.name = name;
		this.age = age;
	}
	
	public String getStudentName(){
		return name;
	}
	
	public String getStudentAge(){
		return age;
	}
}