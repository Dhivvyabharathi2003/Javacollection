package com.examples;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		// TODO Auto-generated constructor stub
    this.id=id;
    this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class AddStudent {
     public static void main(String[] args) {
    	 List<Student>li=new ArrayList<Student>();
    	 li.add(new Student(1,"Arun"));
    	 li.add(new Student(2,"Dhivvya"));
    	 li.add(new Student(3,"Dhanya"));
    	 //1 way
    	 for(int i=0;i<li.size();i++) {
    		 System.out.println(li.get(i));
    	 }
    	 // 2 way
    	 for(Student s:li) {
    		 System.out.println(s);
    	 }
    	 //3 way
    	 li.forEach(s -> System.out.println(s));
     }
}
