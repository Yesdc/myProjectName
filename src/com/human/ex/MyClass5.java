package com.human.ex;

import com.human.dto.*;
//import(불러오기) com.human.dto.*;
public class MyClass5 {

	public static void main(String[] args) {
		//e다른파일 클래스 불러오기
		//java.util.Scanner
		
		
		
//		com.human.dto.Human2 h2=new com.human.dto.Human2();
//		h2.age=25;
//		System.out.println(h2.age);
//		Human2 h4=new Human2();
		
//       City C6=new City();
//       C6.name="아산시";
//       C6.population=333101;
//       C6.man=174414;
//	   C6.woman=158687;
//	   C6.Elderly=42355;
//       System.out.println(C6.name);
//       System.out.println(C6.population);
//       System.out.println(C6.man);
//       System.out.println(C6.woman);
//       System.out.println(C6.Elderly);
//       	  	
		
			Car car=new Car();
			car.color="검정";
			car.company="현대";
			car.maxSpeed=200;
			car.model="소나타";
			car.tire.company="금호타이어";;
			car.tire.mileage=20;
			car.tire.price=50000;
			
			Car car1=new Car();
			car1.color=car.color;
			car1.company=car.company;
			car1.maxSpeed=car.maxSpeed;
			car1.model=car.model;
			car1.tire.company=car.tire.company;
			car1.tire.mileage=car.tire.mileage;
			car1.tire.price=car.tire.price;
			
			
			System.out.println(car.color);
			System.out.println(car.tire.company);
			System.out.println(car1.color);
			System.out.println(car1.tire.company);
			      
		
		
		
	}

}
