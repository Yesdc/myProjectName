package com.human.dto;

public class Cat {
	public int age=0;
	public String name="";
	
	public Cat() {};
	public Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
	
}
