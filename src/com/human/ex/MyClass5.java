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
		
//			Car car=new Car();
//			car.color="검정";
//			car.company="현대";
//			car.maxSpeed=200;
//			car.model="소나타";
//			car.tire.company="금호타이어";;
//			car.tire.mileage=20;
//			car.tire.price=50000;
//			
//			Car car1=new Car();
//			car1.color=car.color;
//			car1.company=car.company;
//			car1.maxSpeed=car.maxSpeed;
//			car1.model=car.model;
//			car1.tire.company=car.tire.company;
//			car1.tire.mileage=car.tire.mileage;
//			car1.tire.price=car.tire.price;
//			
//			
//			System.out.println(car.color);
//			System.out.println(car.tire.company);
//			System.out.println(car1.color);
//			System.out.println(car1.tire.company);
			      
		
//		Bicycle byc=new Bicycle();
//		byc.color="검정";
//		byc.company="삼천리";
//		byc.kind="mtb";
//		byc.helmet.company="스미스";
//		byc.helmet.price=225000;
//		
//		Bicycle byc2=new Bicycle();
//		byc2.color=byc.color;
//		byc2.company=byc.company;
//		byc2.kind=byc.kind;
//		byc2.helmet.company=byc.helmet.company;
//		byc2.helmet.price=byc.helmet.price;
//		
//		System.out.println(byc.color);
//		System.out.println(byc.helmet.company);
//		System.out.println(byc2.color);
//		System.out.println(byc2.helmet.company);
		

//		Human2 h1=new Human2 ("홍길동",25,166.5);
//		System.out.println(h1.name);
//		System.out.println(h1.height);
//		System.out.println(h1.age);
//		
		
		Tree tre1=new Tree("Mango", 4,4,200,50,7,"tomas",51,"010-1111-4444");
		Tree tre2=new Tree("Papaya", 6,6,375,50,6,"yomas",52,"010-2222-4444");
		Tree tre3=new Tree("Banana Palm", 5,5,500,50,7,"homas",53,"010-3333-4444");
		Tree tre4=new Tree("Lemon", 8,8,750,50,1,"romas",54,"010-4444-4444");		
		Owner on1=new Owner("tom",20,"010-5569-9999");
		
		
		
		System.out.println(on1.name+on1.age+on1.tel);
		System.out.println(tre1.name+tre1.hour+tre1.exp+tre1.price+tre1.now+tre1.max+tre1.owner.name);
		System.out.println(tre2.name+tre2.hour+tre2.exp+tre2.price+tre2.now+tre2.max+tre2.owner.name);
		System.out.println(tre3.name+tre3.hour+tre3.exp+tre3.price+tre3.now+tre3.max+tre3.owner.name);
		System.out.println(tre4.name+tre4.hour+tre4.exp+tre4.price+tre4.now+tre4.max+tre4.owner.name);
		
		System.out.println(tre1.owner.age+tre2.owner.name+tre4.owner.tel);
		
		
		
	}

}
