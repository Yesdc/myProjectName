package com.human.ex1;

import java.util.Arrays;

public class method2 {

	
	
	
	
//	public static void f1(int x) {
//		System.out.println(x);
//		if(x<5) {
//			f1(x+1);
//		}
//		System.out.println("end"+x);
//	}
//	
//	public static void function1() {
//		System.out.println("펑션1 시작");
//		function5();
//		function6();
//		System.out.println("펑션1 종료");		
//	}
//	
//	public static void function3() {
//		System.out.println("펑션3 시작");
//		
//		System.out.println("펑션3 종료");		
//	}
//	public static void function4() {
//		System.out.println("펑션4 시작");
//	
//		System.out.println("펑션4 종료");		
//	}
//	public static void function5() {
//		System.out.println("펑션5 시작");
//		function3();		
//		System.out.println("펑션5 종료");		
//	}
//	public static void function6() {
//		System.out.println("펑션6 시작");
//		
//		System.out.println("펑션6 종료");	
//		
//		
//	}
//	
//	
//	public static void function7() {
//		int a=10;
//		a++;
//		System.out.println(a);
//	}
	
	
	public static int[] function6(int a[]) {
		int rValue[]=a;
		rValue[0]=11;
		a[1]=12;
		return rValue;
	}
	public static int[] function7(int a[]) {
		int rValue[]=new int[a.length];
		rValue[0]=a[0];
		rValue[1]=a[1];
		rValue[0]=13;
		a[1]=14;
		return rValue;
	}
	
	
	public static void main(String[] args) {
		
//		f1(1);
//		function1();
//		function3();
//		function4();
//		
//		
//		int a=5;
//		function7();
//		a++;
//		function7();
//		a++;
//		System.out.println(a);
		
		int arr[]= {1,2};
		
		function6(arr);
		System.out.println(Arrays.toString(arr));
		
		int rArr[]=function7(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		
		rArr[1]=9;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		
		
		
		
		
		
		
		
		
		
		
	}

}
