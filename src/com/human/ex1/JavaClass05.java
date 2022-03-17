package com.human.ex1;

public class JavaClass05 {

	public static void main(String[] args) {
//		int input=Integer.parseInt(new java.util.Scanner(System.in).nxetLine());
//		for(초기식;조건식;증감식) {}
//		초기식: 조건식에 쓰일 변수를 초기화하는 식.
//		조건식: for문의 반복 유무를 결정하는 식.
//		증감식: 조건식의 변수를 증감시키는 식.
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum=sum+i;
//		}
//		System.out.println(sum);

//		int sum=0;
//		int i=1;
//		while(i<=10) {
//			if(i%2==0) {
//				sum=sum+i;
//			}
//			i++;
//		}
//		System.out.println(sum);

//		do while 반드시 1번 출력
//	 	초기식
//	 	do{
//		코드
//		증감식
//		}while(조건식);

//	
//		int i=1;	
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<11);
//	

//		문제1
//1-1	
//		System.out.println("01"+" "+"02"+" "+"03");

//1-2		
//		int a=1;
//		System.out.println("01");
//		if(a>5) {
//			System.out.println("03");
//		}else {
//			System.out.println("02");
//		}
//		System.out.println("04");

//1-3			
//		int a=1;
//		System.out.println("01");
//		if(a>5) {
//			System.out.println("02");
//		}else {
//			System.out.println("03");
//		}
//		System.out.println("04");

//1-4	
//		System.out.println("01");
//		for(int a=2;a>5;a++) {
//			System.out.println(a);
//		}
//		System.out.println("03");
//		

//1-5	
//		System.out.println("01");
//		for(int a=6;a>5;a--) {
//			System.out.println("02");
//		}
//		System.out.println("03");

//1-6	
//		System.out.println("01");
//		for(int a=7;a>5;a--) {
//			System.out.println("02");
//		}
//		System.out.println("03");

//1-7
//		System.out.println("01");
//		for(int a=1;a<2;a++) {
//			System.out.println("02");
//		}
//		System.out.println("03");
//		System.out.println("04");
//		for(int a=1;a<2;a++) {
//			System.out.println("11");
//		}
//		System.out.println("05");
//		int i=1;
//		if(i>1) {
//			System.out.println("06");
//			
//		}else {
//			System.out.println("07");
//			System.out.println("08");
//		}
//		System.out.println("09");
//		System.out.println("10");
//		System.out.println("도착");

//		문제2
//		int a=2;
//		int b=1;
//		b=b++;
//		System.out.println(a+" "+b);
//		for(b=2;b<15;﻿b=b+a;) {
//			a=a+1;
//			
//		}
//		System.out.println(a+" "+b);
//		

//		문제3
//3-1		
//		int a=5;
//		System.out.println("P1");
//		for(a=5;a<5;a++) {
//			System.out.println("P2");
//		}
//		System.out.println("P3");
//		if(a<5) {
//			System.out.println("p6");
//			System.out.println("p7");
//			
//		}else {
//			System.out.println("p4");
//			System.out.println("p5");			
//		}
//		System.out.println("p8");
//		System.out.println("p9");
//		System.out.println("종료");

//3-2		
//		
//		int a=4;
//		System.out.println("P1");
//		for(a=4;a<5;a++) {
//			System.out.println("P2");
//		}
//		System.out.println("P3");
//		
//		if(a<5) {
//			System.out.println("p4");
//			System.out.println("p5");
//			
//		}else {
//			System.out.println("p6");
//			System.out.println("p7");			
//		}
//		System.out.println("p8");
//		System.out.println("p9");
//		System.out.println("종료");
//	
//3-3 		
//		int a=4;
//		System.out.println("P1");
//		for(a=2;a<5;a++) {
//			System.out.println("P2");
//		}
//		System.out.println("P3");
//		
//		if(a<5) {
//			System.out.println("p6");
//			System.out.println("p7");
//			
//		}else {
//			System.out.println("p4");
//			System.out.println("p5");			
//		}
//		System.out.println("p8");
//		System.out.println("p9");
//		System.out.println("종료");

//	문제4 1~3를 출력해보자. 이전 순서도에서 ‘안녕’를 출력하는 부분에 i를 넣어서 어떻게
//		출력되는지 고민해 보고 코드를 만들어 보자

//		for(int i=1;i<4;i++) {
//			System.out.println(i);
//		}

//	문제5 1을 3번 더하는 코드를 만들어 보자

//		int sum=0;
//		for(int i=1;i<4;i++) {
//			sum=sum+i;
//		}
//		System.out.println(sum);

//	문제6 3부터 10을 출력하는 코드를 만들어 보자.

//		for(int i=3;i<11;i++) {
//			System.out.println(i);
//		}

//	문제7 1~10까지의 사이 숫자를 더한 총합을 sum에 넣어 출력하는 코드를 만들어 보자.

//		int sum=0;
//		for(int i=1;i<11;i++) {
//			sum=sum+i;			
//		}
//		System.out.println(sum);

//	문제8 15~30까지의 사이 숫자를 더하기 더한 총합을 sum에 넣어 출력하는 코드를 만들어
//		보자.

//		int sum=0;
//		for(int i=15;i<31;i++) {
//			sum=sum+i;
//		}
//		System.out.println(sum);

//	문제9 사용자에게 1부터 9 사이에 숫자를 받아서 사용자가 입력한 숫자에 맞는 구구단의
//		해당 단을 출력해 보자. 예를 들어 사용자가 4를 입력하면 4단을 출력하면 된다.

//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("1~9사이 숫자");
//		int result=0;
//		int num=Integer.parseInt(sc.nextLine());
//		for(int a=1;a<10;a++) {
//			result=a*num;
//			System.out.println(num+"X"+a+"="+result);
//		}

//		ctrl+shift+f 자동코드정렬

	}

}
