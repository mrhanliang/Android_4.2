package com.example.listviewtext;

public class Student {
	
	private String Name;
	
	private String Class;
	
	public Student(String Name , String Class){
		this.Name = Name;
		this.Class = Class;
	}
	
	public String getStudentName(){
		return Name;
	}
	
	public String getStudentClass(){
		return Class;
	}
	
}