package com.justwin.dp.prototype;

import java.util.ArrayList;

public class Resume implements Cloneable {

	private String name;
	private int age;
	private ArrayList<WorkExperience> workExperience; // 浅拷贝
	
	public Resume(String name, int age, ArrayList<WorkExperience> workExperience) {
		this.name = name;
		this.age = age;
		this.workExperience = workExperience;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age );
		for (int i = 0; i < workExperience.size(); i++) {
			System.out.println("Work experience: " + workExperience.get(i));
		}
	}

	public ArrayList<WorkExperience> getWorkExperience() {
		return workExperience;
	}
	
}
