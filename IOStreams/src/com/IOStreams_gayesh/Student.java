package com.IOStreams_gayesh;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private double marks;

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public void getDetails() {
		System.out.println("id of the student :" + id);
		System.out.println("name of the student :" + name);
		System.out.println("marks of the student :" + marks);
	}

	/*@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
*/
}
