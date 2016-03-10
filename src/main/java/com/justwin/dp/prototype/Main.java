package com.justwin.dp.prototype;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author justwin
 * @date 2016年3月10日
 * @version 1.0
 * @description prototype. 
 */
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// create work experience
		ArrayList<WorkExperience> ls = new ArrayList<WorkExperience>();
		ls.add(new WorkExperience("Mixi", new Date(1330531200000L), new Date(1371398400000L)));
		ls.add(new WorkExperience("Ximalaya", new Date(1372262400000L), new Date(1426867200000L)));
		
		Resume resume = new Resume("张三", 20, ls);
		resume.display();
		
		Resume cloneResume = (Resume) resume.clone();
		cloneResume.display();
	
		assertNotEquals(resume, cloneResume);
		
		// TODO 深拷贝 work experience
	}
}
