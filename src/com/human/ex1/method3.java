package com.human.ex1;
import java.util.Arrays;
import java.util.Scanner;
import com.human.dto.Cat;
public class method3 {
	
	
//	문제1
	public static void triangle1() {
		for(int i=0;i<5;i++) {
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void triangle2() {
		for(int i=0;i<5;i++) {
			for(int k=i;k<5;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void triangle3() {
		for(int i=0;i<5;i++) {
			for(int h=i;h<4;h++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
//	문제2
	public static void BusinessCard(String name,String email,String tel) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(tel);
		
		
	}
	
//	문제3
	public static int[] sum1(int a[]) {
		int a2[]=a;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a2[i];
		}			
		System.out.print(sum);
		return a2;
		
	}
	
//	문제4
	
	public static void calender(int dayNum, String day) {
		String days[]={"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.println("일요일"+"\t"+"월요일"+"\t"+"화요일"+"\t"+"수요일"+"\t"+"목요일"+"\t"+"금요일"+"\t"+"토요일");
		
    	for(int k=0;k<days.length;k++) {
			if(!day.equals(days[k])) {
				System.out.print("\t");
			}else {
				break;
			}
		}
		
//		for(int a=1;a<dayNum;a++) {
//			System.out.print(a+"일"+"\t");
//			if((days.equals("월요일")&&a==6)) {
//				System.out.println("");
//			}
//		}
//	}
	
//	문제5 매개 변수가 하나인 메소드 6개(intFunc,doubleFunc,stringFunc,catFunc,intArrFunc,catArrFunc)를
//	각각 만들어 보자. 메소드 별 각각의 매개변수는 다음과 같다
//	인트 더블 스트링, 이름나이를 저장하는 고양이 객체(cat) int형배열(int[]), 고양이객체배열(cat[])
//	해당 메소드들의 용도는 매개변수로 받은 데이터를 화면에 출력하고 해당 객체내용을 변경하여 리턴해주는 메소드이다.
//	메인 메소드에서 해당 메소드를 호출 하여 메소드 안에서 데이터를 출력해보고 리턴 받은 값을 이용해서 데이터를 출력해보자
	
	
	
	public static Cat catFunc(Cat cat) {
		Cat rValue=cat;
		System.out.println(cat);
		rValue.age=16;
		rValue.name="벌";
		return rValue;
	}
	
	public static int intFunc(int a) {
		int c=a;
		System.out.println(a);
		c=6;
		return c;
	}
	
	public static double doubleFunc(double a) {
		double c=a;
		System.out.println(a);
		c=0.68;
		return c;
	}
	
	public static String stringFunc(String a) {
		String c=a;
		System.out.println(a);
		c="바뀜";
		return c;
	}
	
	
	public static int[] intArrFunc(int a[]) {
		int rValue[]=a;
		System.out.println(Arrays.toString(a));
		rValue[1]=3;
		return rValue;
	}
	
	public static Cat[] catArrFunc(Cat cat[]) {
		Cat rValue[]=cat;
		System.out.println(Arrays.toString(cat));
		rValue[0].age=8;
		rValue[0].name="나방";
		rValue[1].age=13;
		rValue[1].name="장수말벌";
		rValue[2].age=17;
		rValue[2].name="풍뎅이";
		return rValue;
	}
	
//	문제6메뉴에 어떤도형의 넓이를 구할 것인지 사용자에게 물어본 다음 원의 넓이 구하는
//	메소드 사각형의 넓이를 구하는 메소드 삼각형의 넓이를 구하는 메소드를 이용해서 원을
//	구하는 메소드를 만들어 보자.
	
	public static double circle(int radius) {
		double area=0;
		
		area=radius*radius*3.14;
		System.out.print(area);
		return area;
	}
	public static int quadrangle(int width, int column) {
		int area=0;		
		area=width*column;
		System.out.print(area);
		return area;
	}
	public static double triangle(int bottom, int height) {
		double area=0;
		
		area=(bottom*height)/2;
		System.out.print(area);
		return area;
	}
	
//	문제7 매개변수에 숫자하나를 받아 들어서 구구단중 해당 숫자의 단수를 출력하는
//	메소드를 작성해서 숫자하나를 입력받아 해당 숫자의 단을 출력하는 프로그램을 완성해
//	보자.

	public static void timesTable(int num) {
		for(int i=1;i<10;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
	

	
//	
	
	public static void main(String[] args) {

//		triangle1();
//		triangle2();
//		triangle3();
		
	
//		BusinessCard("임창우","dlackddn123@naver.com","010-4998-2601");
//		
		
		
//		int b[]= {1,6,8,9};
//		sum1(b);
		
		
		
		calender(30,"월요일");
		
		
		
//		Cat cat=new Cat(15,"나비");
//		System.out.println(cat);
//		System.out.println(catFunc(cat));
//			
//		int b=8;
//		System.out.println(b);
//		
//		System.out.println(intFunc(b));
//		
		
		
		
//		double b=5.489;
//		System.out.println(b);
//		System.out.print(doubleFunc(b));
//				
//		String b="안바뀜";
//		System.out.println(b);
//		System.out.println(stringFunc(b));
//				
//		int b[]= {1,2,3};
//		System.out.println(Arrays.toString(b));
//		intArrFunc(b);
//		System.out.println(Arrays.toString(b));
//				
//		Cat cat[]= {new Cat(15,"나비"),new Cat(20,"벌"),new Cat(18,"사슴벌레")};
//		System.out.println(Arrays.toString(cat));
//		catArrFunc(cat);
//		System.out.println(Arrays.toString(cat));
//		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int radius=0;
//		int width=0;
//		int column=0;
//		int bottom=0;
//		int height=0;
//		System.out.print("도형 선택 1.원 2.사각형 3.삼각형");
//		int select=sc.nextInt();
//		switch(select) {
//		case 1:
//			System.out.print("반지름 입력");
//			radius=sc.nextInt();
//			circle(radius);
//			break;
//		case 2:
//			System.out.print("가로길이 입력");
//			width=sc.nextInt();
//			System.out.print("세로길이 입력");
//			column=sc.nextInt();
//			
//			quadrangle(width,column);
//			break;
//		case 3:
//			System.out.print("밑변 입력");
//			bottom=sc.nextInt();
//			System.out.print("높이 입력");
//			height=sc.nextInt();
//			triangle(bottom,height);
//			break;
//		default:
//			break;
//			
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("단 입력");
//		int num=sc.nextInt();
//		timesTable(num);
		
	
		
		
	}

}
