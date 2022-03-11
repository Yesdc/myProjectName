package com.human.ex1;

import java.util.Arrays;

public class JavaClass01 {

	public static void main(String[] args) {
			
//			int arr1[]=new int[5];
//			int []arr2=new int[4];
//			int []arr3;
//			arr3=new int[5];
//			int arr4[]= {0,0,0,0,0};
//			
//			arr1[0]=10;
//			arr2[1]=20;
//			arr3[2]=30;
//			arr1[3]=40;
//			arr2[4]=50;
//				//arr1[인덱스] 이런 형태 하나가 변수 하나랑 동일함
//			int sum=arr1[1]+arr1[4]+10;
//			
//			//
//			Human3 arrHuman[]=new Human3[3];
//					
		
		
//	  문제0  배열에 53,6,85,3,5를 넣은 다음 배열의 내용을 화면에 출력해 보자.
		
//			int ar[]= {53,6,85,3,5};
//			System.out.println(Arrays.toString(ar));		
		
		
//	  문제1	배열 a[]={12,1,53,6,85,3}를 만든 다음에 배열의 모든 내용을 더한 값을 sum에
//		    저장하여 출력하는 코드를 만들어 보자.
//		
//		    int a[]= {12,1,53,6,85,3};
//		    int sum=a[0]+a[1]+a[2]+a[3]+a[4]+a[5];
//		    System.out.print(sum);
		    
		
//	  문제2   배열 a에 1,2,3 을 넣은 후 배열 내의 모든 값에 2를 더한 값인 3,4,5로 변경한
//		    다음에 배열의 내용을 화면에 인덱스 순서대로 출력해 보고 인덱스 역순으로 출력해보자.	
		
//			int a[]= {1,2,3};
//			a[0]=a[0]+2;
//			a[1]=a[1]+2;
//			a[2]=a[2]+2;
//			System.out.println(Arrays.toString(a));
//				
//			a[0]=a[2];
//			a[2]=3;
//			System.out.println(Arrays.toString(a));			
		
		
//		문제3 배열에 들어있는 값중 짝수만 화면에 출력하시오.
		
//		    int a[]= {1,2,3,4,5,6,7,8};
//		    System.out.println(a[1]);
//		    System.out.println(a[3]);
//		    System.out.println(a[5]);
//		    System.out.println(a[7]);
//		    
		    
//	    문제4 인덱스가 홀수인 배열의 값을 출력하시오.
	
//		    int a[]= {1,2,3,4,5,6,7,8};
//		    System.out.println(a[0]);
//		    System.out.println(a[2]);
//		    System.out.println(a[4]);
//		    System.out.println(a[6]);
	   
		
//		1번
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("숫자");
//		int Num=0;
//		Num=Integer.parseInt(sc.nextLine());
//		int a=11;
//		int b=14;
//		if(Num==0) {
//			System.out.println(a=5);
//		}else {
//			System.out.println(b=a+3);
//		}
				
		
//		2번
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("5or-5");
//		int Num=0;
//		Num=Integer.parseInt(sc.nextLine());
//		if(Num==5) {
//			System.out.println(5);
//		}else if(Num==-5) {
//			System.out.println(Num*-1);
//		}
		
	
//		3번 사용자에게
//		숫자를 하나 입력받아 126의 약수인지
//		아닌지 기술해 보자.

//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("숫자");
//		int Num=0;		
//		Num=Integer.parseInt(sc.nextLine());
//		int result=126%Num;
//		if(result==0) {
//			System.out.println("126의 약수");
//		}else {
//			System.out.println("126의 약수가아님");
//		}
		
//		
//		4번 국영수과목의 점수를 입력받아 평균이
//		80이상이면 합격 이하면 불합격을 출력해
//		보자.
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);		
//		int kor=0;
//		int eng=0;
//		int math=0;
//		double aver=0;
//		System.out.println("국어 점수");
//		kor=Integer.parseInt(sc.nextLine());
//		System.out.println("영어 점수");
//		eng=Integer.parseInt(sc.nextLine());
//		System.out.println("수학 점수");
//		math=Integer.parseInt(sc.nextLine());
//		aver=(kor+eng+math)/3;
//		if(aver>=80) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");			
//		}
		
		
//		5번
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int num=0;
//		System.out.println("숫자입력");
//		num=Integer.parseInt(sc.nextLine());
//		if(5>=num) {
//			System.out.print(num+15);
//		}else {
//			System.out.print(num+5);
//		}
		
		
//		6번 
//		모든결과에 4번이 같이나온다
		
//		문제1  변수 a에 20, b에 0를 넣은 다음 만약에 a가 10보다 크면 a에 b를 넣고 아니면
//		b에 a를 넣어서 a,b값을 출력하는 프로그램을 만들어 보자.
//		
//		int a=20;
//		int b=0;
//		if(a>10) {
//			System.out.println(a=b);
//		}else {
//			System.out.println(b=a);
//		}
		
//      문제2 입력한 숫자가 10보다 큰 수인지 아닌지 출력하는 코드를 만들어 보자.		
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int num=0;
//		System.out.println("숫자입력");
//		num=Integer.parseInt(sc.nextLine());
//		if(num>10) {
//			System.out.println("10보다 큰수");
//		}else {
//			System.out.println("10보다 작은수");
//		}
		
		
//		문제3 result라는 변수를 선언하고 사용자에게 수를 입력 받아 0이 면 0를 0이아니면 1를
//		넣어서 출력하는 프로그램을 구현해 보자.
//			
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int result=0;
//		System.out.println("숫자입력");
//		result=Integer.parseInt(sc.nextLine());
//		if(result==0) {
//			System.out.println(0);
//		}else {
//			System.out.println(1);
//		}
		
//		문제5 입력 받은 숫자의 절대값을 출력하는 프로그램을 만들어 보자.
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int num=0;
//		System.out.println("숫자입력");
//		num=Integer.parseInt(sc.nextLine());
//		if(num>0) {
//			System.out.println(num);
//		}else {
//			System.out.println(num*-1);
//		}
		
		
//		문제6 두수를 입력해서 큰수에서 작은수를 뺀 차이를 출력하는 프로그램을 구현해 보자.
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int num1=0;
//		int num2=0;
//		System.out.println("숫자입력1");
//		num1=Integer.parseInt(sc.nextLine());
//		System.out.println("숫자입력2");
//		num2=Integer.parseInt(sc.nextLine());
//		if(num1>num2) {
//			System.out.println(num1-num2);
//		}else {
//			System.out.println(num2-num1);
//		}
		
		
//		문제7 입력받은 3개의 숫자 중 가장 큰 수를 출력하는 코드를 구현하시오. 3개중에서
//		2개를 선택해서 큰수를 구한후 나머지 하나를 비교해 보면된다.
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int num1=0;
//		int num2=0;
//		int num3=0;
//		System.out.println("숫자입력1");
//		num1=Integer.parseInt(sc.nextLine());
//		System.out.println("숫자입력2");
//		num2=Integer.parseInt(sc.nextLine());
//		System.out.println("숫자입력3");
//		num3=Integer.parseInt(sc.nextLine());
//		if(num1>num2) {
//			if(num1>num3) {
//				System.out.println(num1);
//			}else {
//				System.out.println(num3);
//			}
//		}else if(num2>num1) {
//			if(num2>num3) {
//				System.out.print(num2);
//			}else {
//				System.out.println(num3);
//			}
//		}
		
		
		
		
		
	}

}
