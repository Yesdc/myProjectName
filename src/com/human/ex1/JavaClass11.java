package com.human.ex1;

import java.util.Arrays;
import java.util.Scanner;
public class JavaClass11 {

	public static void main(String[] args) {
		
//		int arr[]= {6,5,1,8,7,4,2,3};
//		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//					System.out.println(Arrays.toString(arr));
//				}
//			}
//		}
//		System.out.print(Arrays.toString(arr));
//		
//		
//		
//		int arr[]= {6,5,1,8,7,4,2,3};
//	
//		System.out.println(Arrays.toString(arr));
//		for(int i=7;i>0;i--) {
//			int maxIndex=0;		
//			int selectIndex=i;
//			for(int j=0;j<selectIndex;j++) {
//				if(arr[j] > arr[maxIndex]) {					
//					maxIndex=j;
//				}
//			}			
//			int temp=arr[maxIndex];
//			arr[maxIndex]=arr[selectIndex];
//			arr[selectIndex]=temp;
//			System.out.println(Arrays.toString(arr));
//		}
		
		
//		문제1
//		for(int i=1;i<51;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		
//		문제2 1~100사이의 10의 배수을 출력하는 코드를 만들어 보자. 어떤 숫자가 배수 인지
//		아닌지 알고 싶으면 7로 나눈 나머지가 0이면 7의 배수이고 아니면 7의 배수가 아니다.
		
//		for(int i=1;i<101;i++) {
//			if(i%10==0) {
//				System.out.println(i);
//			}
//		}
		
		
//		문제3
//		30~300까지의 6의 배수의 합을 출력하는 코드를 만들어 보자.
//		int sum=0;
//		for(int i=30;i<301;i++) {
//			if(i%6==0) {
//				sum=sum+i;
//			}
//		}
//		System.out.print(sum);
		
		
//		문제4숫자를 하나 입력 받아 1부터 입력한 수까지 순서대로 화면에 출력 되도록 코드를
//		만들어 보자.		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		for(int i=1;i<a+1;i++) {
//			System.out.println(i);
//		}
		
		
//		문제5사용자에게 두 수를 입력받아 두 수의 사이에 있는 모든 수를 오름차 순으로
//		출력하는 순서도와 프로그램을 만들어 보자. 예)5 9 입력시 6 7 8 더한 결과를 얻음
//		Scanner sc=new Scanner(System.in);
//		int a,b;
//		int sum=0;
//		a=sc.nextInt();
//		b=sc.nextInt();
//		
//		if(a>b) {
//			for(int i=b+1;i<a;i++) {
//				System.out.println(i);
//				sum=sum+i;
//			}
//		}else {
//			for(int i=a+1;i<b;i++) {
//				System.out.println(i);
//				sum=sum+i;
//			}
//		}
//		System.out.print(sum);
		
		
//		문제6 두수를 입력 받아 사이에 있는 짝수를 화면에 오름차 순으로 출력 되도록 순서도와
//		프로그램을 만들어 보자.
//		Scanner sc=new Scanner(System.in);
//		int a,b;
//		int sum=0;
//		a=sc.nextInt();
//		b=sc.nextInt();
//		
//		if(a>b) {
//			
//			for(int i=b+1;i<a;i++) {
//				if(i%2==0) {
//				System.out.println(i);
//				sum=sum+i;
//				}
//			}
//		}else {
//			for(int i=a+1;i<b;i++) {
//				if(i%2==0) {
//				System.out.println(i);
//				sum=sum+i;
//				}
//			}
//		}
//		System.out.print(sum);
		
		
//		문제7 1-2+3-4+5-6……+99-100의 결과를 구하는 프로그램을 작성해 보자
//		int sum=0;
//		for(int i=1;i<101;i++) {
//			if(i%2==0) {
//				sum=sum-i;
//			}else {
//				sum=sum+i;
//			}	
//			
//		}
//		System.out.print(sum);
		
		
//		문제8 1/2+2/3+3/4+4/5+ 5/6+6/7+....+99/100의 결과를 구하는 프로그램을 작성해
//		보자.
//		double sum=0;
//		for(double i=1;i<101;i++) {
//			sum=sum+(i/(i+1));
//		}
//		System.out.print(sum);
		
		
//		문제9	  피보나치 수열을 10개를 순서대로 출력하는 프로그램을 작성해 보자. 피보나치
//		수열이 무엇인지는 웹사이트를 검색해서 스스로 알아보자.
//		int f1=1;
//		int f0=0;
//		for(int i=0;i<10;i++) {
//			int sum=f1+f0;
//			f0=f1;
//			f1=sum;
//			System.out.println(sum);					
//		}
		
		
//		문제10 원하는 색의 전구와 밝기를 입력 받아 처리하는 프로그램을 만들어 보자. 사용자가
//		원하는 밝기와 색상을 입력받아 원하는 결과를 출력 받자. 아래 설명한 내용대로 운영
//		되도록 기술 하자.
//		초기 변수값 : color=”빨강” brightness =50
//				값의 범위 : color=빨강,노랑,파랑 brightness는 0~100
//				제안사항 : brightness의 숫자 변경은 1씩 가능하다. brightness값이 10이라면 다음
//				brightness값은 11 이나 9 만 가능하다. 10을 50으로 변경하려면 반복문을 사용해야 한다.
//				사용자입력변수 : colorInput, brightnessInput
//				최종결과값출력 : p(“현재 색상은”+color+”밝기는”+brightness+”이다”);
		
//		Scanner sc=new Scanner(System.in);
//		int brightness=50;
//		String color="빨강";
//		int brightnessInput=0;
//		String colorInput="";
//		System.out.print("원하는색 입력(빨강,노랑,파랑)");
//		colorInput=sc.next();
//		System.out.print("원하는 밝기입력(0~100)");
//		brightnessInput=sc.nextInt();
//		
//		if(colorInput.equals("노랑")) {
//			colorInput="노랑"	;		
//		}else if(colorInput.equals("파랑")) {
//			colorInput="파랑";
//		}
//		for(int i=0;i<101;i++) {
//			if(brightnessInput>50) {
//				brightness++;
//			}else if(brightnessInput<50) {
//				brightness--;
//			}
//			if(brightnessInput==brightness) {
//				break;
//			}
//		}
//		System.out.print("현재 색상은 "+color+" 밝기는 "+brightness+"이다");
		
		
//		문제11 1-2+3-4+5-6……+99-100의 결과를 구하는 순서도와 프로그램을 작성해 보자.
//		int sum=0;
//		for(int i=1;i<101;i++) {
//			if(i%2==0) {
//				sum=sum-i;
//			}else {
//				sum=sum+i;
//			}	
//			
//		}
//		System.out.print(sum);
		
		
//		문제12 1/2+2/3+3/4+4/5+ 5/6+6/7+....+99/100의 결과를 구하는 순서도와 프로그램을
//		작성해 보자.
//		double sum=0;
//		for(double i=1;i<101;i++) {
//			sum=sum+(i/(i+1));
//		}
//		System.out.print(sum);
		
		
//		문제13 다음과 같이 출력 되도록 프로그램을 완성해 보자.
//		1 2 3 4 5
//		10 9 8 7 6
//		11 12 13 14 15
//		20 19 18 17 16
//		21 22 23 24 25
				
//		for(int j=1;j<6;j++) {
//			System.out.print(j);
//			System.out.print(" ");				
//		}
//		System.out.println("");
//		for(int j=10;j>5;j--) {
//			System.out.print(j);
//			System.out.print(" ");				
//		}
//		System.out.println("");
//		for(int j=11;j<16;j++) {
//			System.out.print(j);
//			System.out.print(" ");				
//		}
//		System.out.println("");
//		for(int j=20;j>15;j--) {
//			System.out.print(j);
//			System.out.print(" ");				
//		}
//		System.out.println("");
//		for(int j=21;j<26;j++) {
//			System.out.print(j);
//			System.out.print(" ");				
//		}
		
			
//		문제14 해당 달의 시작 요일과 일수를 입력 받아 달력을 출력해 보자.\t 탭을 이용해서
//		만들어 보자.
//		
//		Scanner sc=new Scanner(System.in);
//		String day="";
//		int num=0;
//		System.out.print("요일 입력");
//		day=sc.next();
//		System.out.print("일수 입력");
//		num=sc.nextInt();
//		String ar[]= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
//		for(int i=0;i<7;i++) {
//			if(ar[i].equals(day)) {
//				for(int a=0;a<7;a++) {
//					if(a==i) {
//						for(int b=0;b<a;b++) {
//							System.out.print("\t");
//						}
//						
//						
//					}
//				}
//				for(int c=1;c<num+1;c++) {
//					System.out.print(c+"일");
//					System.out.print("\t");
//					if(ar[c].equals("토요일")) {
//						System.out.println("");
//					}
//				}	
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
