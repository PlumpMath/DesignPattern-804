package com.justwin.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class Resume implements Cloneable {

	private String name;
	private int age;
	private List<WorkExperience> workExperience; // 浅拷贝
	
	public Resume(String name, int age, List<WorkExperience> workExperience) {
		this.name = name;
		this.age = age;
		this.workExperience = workExperience;
	}

	// 深拷贝
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume clone = (Resume)super.clone();
		List<WorkExperience> work = new ArrayList<WorkExperience>();
		for (WorkExperience exp : workExperience) {
			work.add((WorkExperience)exp.clone());
		}
		clone.setWorkExperience(work);
		
		return clone;
	}

	// 浅拷贝
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	public void display() {
		System.out.println( "Object: " + this + " = Name: " + name + ", Age: " + age );
		for (int i = 0; i < workExperience.size(); i++) {
			System.out.println("Work experience: " + workExperience.get(i));
		}
	}

	public List<WorkExperience> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(List<WorkExperience> workExperience) {
		this.workExperience = workExperience;
	}
	
}
