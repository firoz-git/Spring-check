package com.learn.first;

public class Course {
	private long id;
	private String name;
	private String place;
	
	public Course(long id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}
	
	
	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getPlace() {
		return place;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", place=" + place + "]";
	}
	
	
}