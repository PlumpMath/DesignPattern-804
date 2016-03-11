package com.justwin.dp.prototype;

import java.util.Date;

public class WorkExperience implements Cloneable{
	
	private String company;
	private Date start;
	private Date end;
	
	public WorkExperience(String company, Date start, Date end) {
		this.company = company;
		this.start = start;
		this.end = end;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		WorkExperience clone = (WorkExperience) super.clone();
		clone.start = (Date) start.clone();
		clone.end = (Date) end.clone();
		return clone;
	}

	@Override
	public String toString() {
		return "Company: " + company + ", start: " + start + ", end: " + end;
	}
}
