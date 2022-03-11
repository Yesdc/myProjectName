package com.human.ex1;

import java.util.Objects;

public class Human3 { //클래스 정의
		
		
	public String name="홍길동";  //필드
	public int age=11;
	public double height=142;
	
	
	public Human3() {}
	public Human3(String name, int age, double height) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
}
	
	
	
	
	
	
	
		
	@Override
	public int hashCode() {
		return Objects.hash(age, height, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human3 other = (Human3) obj;
		return age == other.age && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {//메소드
		return "Human3 [name=" + this.name + ", age=" + age + ", height=" + height + "]";
	}
	

	
	
	
				
	
	
	
	
	
	
		
		
}
