package com.human.ex1;
import java.util.Scanner;
public class method1 {
//	문제1
	 static int sum(int a, int b) {
		int sum=0;
		return sum=a+b;
		
	}
	
	public static int min(int a, int b) {
		int min=0;
		return min=a-b;
	}
	
	public static int div(int a, int b) {
		int div=0;
		return div=a/b;
	}
	
	public static int mul(int a, int b) {
		int mul=0;
		return mul=a*b;
	}
//	문제2
	
	public static void hello() {
		System.out.println("안녕하세요");
	}
	
//	문제3
	public static int gapsum(int a, int b) {
		int gapsum=0;
		if(a>b) {
			int c=a;
			a=b;
			b=c;
		}
		for(int i=a;i<b+1;i++) {
			gapsum=gapsum+i;
		}
		return gapsum;
	}
	
//	문제3
	public static void seven(int a) {
		if(a%7==0) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
	}
	
	public static boolean function3(int num) {
		boolean returnValue=false;
		
		if(num%7==0) {
			returnValue=true;
		}else {
			returnValue=false;
		}
		
		return returnValue;
	}
//	관용적으로 리턴할 변수를 메소드의 맨처음에 기술하고 리턴값은 맨 마지막에 기술한다.
	
//	문제4
	public static void repeat() {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자입력");
		String inputString=sc.next();
		System.out.println("숫자입력");
		int inputNumber=sc.nextInt();
		for(int i=0;i<inputNumber;i++) {
			System.out.println(inputString);
		}
		
	}
	
	public static void repeatString(String str,int count) {
		for(int i=0;i<count;i++) {
			System.out.println(str);
		}
		
		
		return;
	}
	
	
	
	public static void main(String[] args) {
		
		int a=sum(1,2);
		System.out.println(a);
		int b=min(4,2);
		System.out.println(b);
		int c=div(4,2);
		System.out.println(c);
		int d=mul(5,2);
		System.out.println(d);
		
		hello();
		hello();
		for(int i=0;i<3;i++) {
			hello();
		}
		
		int f=gapsum(5,2);
		System.out.println(f);
		
		seven(21);
		System.out.println("");
		seven(22);
		System.out.println("");
		
//		repeat();
//		
		System.out.println(function3(100));
		if(function3(49)) {
			System.out.println("7의 배수");
		}else {
			System.out.print("7의 배수가 아님");
		}
		
		repeatString("하이",6);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
