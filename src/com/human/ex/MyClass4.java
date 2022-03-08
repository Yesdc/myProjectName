package com.human.ex;

public class MyClass4 {

	public static void main(String[] args) {
	
//			double kor=0;
//			double eng=0;
//			double math=0;
//			double avg=0;
//			java.util.Scanner sc=new java.util.Scanner(System.in);		
//			System.out.println("국어성적입력");
//			kor=Double.parseDouble(sc.nextLine());		
//			System.out.println("영어성적입력");
//			eng=Double.parseDouble(sc.nextLine());		
//			System.out.println("수학성적입력");
//			math=Double.parseDouble(sc.nextLine());		
//			avg=(kor+eng+math)/3;
//			System.out.println("국어:"+kor+" 영어:"+eng+" 수학:"+math+" 평균:"+avg);
		
		
		
//			java.util.Scanner sc=new java.util.Scanner(System.in);					
//			double width=0;
//			double depth=0;
//			double height=0;
//			double result=0;
//			System.out.println("가로길이입력");
//			width=Double.parseDouble(sc.nextLine());		
//			System.out.println("세로길이입력");
//			depth=Double.parseDouble(sc.nextLine());		
//			System.out.println("높이입력");
//			height=Double.parseDouble(sc.nextLine());		
//			result=width*depth*height;
//			System.out.println(result);

			
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);					
//		double box=0;
//		double pencil=0;
//		double price=0;
//		double result=0;
//		System.out.println("몇 박스");
//		box=Double.parseDouble(sc.nextLine());		
//		System.out.println("추가 몇 자루");
//		pencil=Double.parseDouble(sc.nextLine());		
//		System.out.println("가격");
//		price=Double.parseDouble(sc.nextLine());		
//		result=(box*12+pencil)*price;
//		System.out.println(result);
//		
		
		//String.format() : 새로운 문자열을 만드는 메소드

//		String str=String.format(">%s %s %d %f", "이건", "뭐지", 558,51.6);
//		System.out.println(str);
//		System.out.println("첫번째문자열은:"+"시작");

		
		
//		String name="홍길동";
//		int age=20;
//		double height=120.2;
//		
//		System.out.println(String.format("이름:%s 나이:%d 키:%f",name,age,height));
		

		
		//문제1
		
//		int age=156;
//		String name="hong";
//		double height=175.3;
//		System.out.println(String.format("나이:%d 이름:%s 키:%d", age, name, height));
	
		
		
		
		//문제2
		
//		int one=0;
//		int two=0;
//		int result1=0;		int result2=0;
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("첫번째 정수");
//		one=Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 정수");
//		two=Integer.parseInt(sc.nextLine());
//		result1=one/two;
//		result2=one%two;
//		System.out.println(String.format("몫은 %d 이고, 나머지는 %d이다.", result1, result2));
		
			
		
	
		
		//문제3
		
//		int A=0;
//		int result100=0;
//		int result10=0;
//		int result1=0;
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("3자리 입력");
//		A=Integer.parseInt(sc.nextLine());
//		result100=A/100;
//		result10=A/10%10;
//		result1=A%10;				
//		System.out.println(String.format("백의자리:%d 십의자리:%d 일의자리:%d", result100, result10, result1));


		
		//문제4
		
		double x1=0;
		double y1=0;
		double x2=0;
		double y2=0;
		double result=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("x1 입력");
		x1=Double.parseDouble(sc.nextLine());
		System.out.println("y1 입력");
		y1=Double.parseDouble(sc.nextLine());
		System.out.println("x2 입력");
		x2=Double.parseDouble(sc.nextLine());
		System.out.println("y2 입력");
		y2=Double.parseDouble(sc.nextLine());
		result=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(String.format("거리:%f", result));
		
		
		
		
		
		
		
		
		
		
			
			
	}

}
