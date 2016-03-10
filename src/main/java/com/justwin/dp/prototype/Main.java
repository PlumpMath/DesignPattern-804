package com.justwin.dp.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Resume resume = new Resume("张三", 20);
		resume.display();
		Resume cloneResume = (Resume) resume.clone();
		cloneResume.display();
	
	
	}
}
