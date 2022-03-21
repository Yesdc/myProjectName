package com.human.ex1;

import java.util.Arrays;

public class JavaClass07 {

	public static void main(String[] args) {

//		배열안에 6의배수 10개를 넣은다음 인덱스순으로 출력해보자.
//		int arr[]=new int[10];		
//		for(int i=0;i<10;i++) {
//			arr[i]=6*i;			
//		}
//		System.out.println(Arrays.toString(arr));
//		
		
		
//		문제1 ) 배열 a에 1,2,3 을 넣은 후 배열 내의 모든 값에 2를 더한 값인 3,4,5로 변경한
//		다음에 배열의 내용을 화면에 출력하는 순서도와 코드를 구현하여 보자.
		
//		int arr[]= {1,2,3};
//		for(int i=0;i<3;i++) {
//			arr[i]=arr[i]+2;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
//		문제2  배열 a[10]에 3의 배수를 넣은 다음에 배열의 내용을 출력하는 순서도와
//		의사코드를 만들어 보자.
		
//		int arr[]=new int[10];
//		for(int i=0;i<10;i++) {
//			arr[i]=i*3;
			
//		}
//		System.out.println(Arrays.toString(arr));

		
//		문제3 배열 a[100]에 1부터 100까지의 숫자를 순서대로 넣은 다음 배열의 인덱스가
//		짝수인 배열에 들어 있는 값만 출력하는 코드를 만들어 보자.
		
//		int arr[]=new int[100];
//		for(int i=0;i<100;i++) {
//			arr[i]=i+1;					
//			if(arr[i]%2==0) {				
//				System.out.println(arr[i]);				
//			}						
//		}
		
		
//		문제4 배열 a[]={12,1,5,3,6,8,5,3}를 만든 다음에 배열의 모든 내용을 더한 값을
//		sum에 저장하여 출력하는 코드를 만들어 보자.
		
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		for(int i=0;i<8;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
		
//		문제5  a[]={12,1,5,3,6,8,5,3}의 a배열에서 배열 안의 숫자가 짝수인 12,6,8 의 값을
//		더한 결과 값을 출력하는 프로그램을 작성해 보자.
		
//		int a[]={12,1,5,3,6,8,5,3};
//		int sum=0;
//		for(int i=0;i<8;i++) {
//			if(a[i]%2==0) {
//				sum=sum+a[i];
//				
//			}
//		}
//		System.out.print(sum);
		
		
//		문제6  a[]={12,1,51,3,6,8,5}의 a배열에서 가장 큰 값과 가장 작은 값을 더하는
//		프로그램을 작성해 보자.
//		int a[]={12,1,51,3,6,8,5};
//		int num=a[0];
//		int num2=a[0];
//		for(int i=0;i<7;i++) {
//			if(num>a[i]) {
//				num=a[i];
//			}
//			if(num2<a[i]) {
//				num2=a[i];
//			}
//		}
//		System.out.println(num+num2); 

//		문제7 배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아 해당 숫자가 몇번째
//		인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.
		
//		System.out.println("숫자입력1");
//		int a1=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("숫자입력2");
//		int a2=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("숫자입력3");
//		int a3=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("숫자입력4");
//		int a4=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("숫자입력5");
//		int a5=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("찾을 숫자입력");
//		int a6=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int arr[]= {a1,a2,a3,a4,a5};
//		for(int i=0;i<5;i++) {			
//			if(a6==arr[i]) {
//				System.out.println(i+"번 인덱스에 들어가있다");
//				break;
//			}
//		}
		
		
//		문제8 배열에 5개의 문자를 입력받아 넣은 다음 문자 하나를 입력받아 해당 문자가 몇번째
//		인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.
		
//		System.out.println("문자입력1");
//		String a1=new java.util.Scanner(System.in).nextLine();		
//		System.out.println("문자입력2");
//		String a2=new java.util.Scanner(System.in).nextLine();
//		System.out.println("문자입력3");
//		String a3=new java.util.Scanner(System.in).nextLine();
//		System.out.println("문자입력4");		
//		String a4=new java.util.Scanner(System.in).nextLine();
//		System.out.println("문자입력5");
//		String a5=new java.util.Scanner(System.in).nextLine();
//		System.out.println("찾을 문자입력");
//		String a6=new java.util.Scanner(System.in).nextLine();
//		String arr[]= {a1,a2,a3,a4,a5};
//		for(int i=0;i<5;i++) {
//			if(a6.equals(arr[i])) {
//				System.out.println(i+"번 인덱스에 들어가있다");
//				break;
//		}
//		}
		
		
//		문제9 배열 크기를 입력받아 배열 크기 만큼 1,2,3,1,2,3,1,2,3 … 숫자를 순서대로 배열안에
//		넣은 다음 배열의 내용을 출력해 보자.
		
//		System.out.println("배열크기 입력");
//		int a1=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int arr[]=new int[a1];
//		for(int i=0;i<a1;i++) {
//			System.out.println("1,2,3");
//		}
		
		
//		문제10 .배열에 들어있는 내용을 정순과 역순으로 저장하는 새로운 배열을 만들어 출력해 보자.
//		int a[]= {1,2,3,4};
//		for(int i=0;i<=4;i++) {
//			if(i==4) {
//				for(i=3;i>=0;i--) {
//					System.out.println(a[i]);					
//				}
//				if(i<0) {
//					break;
//				}	
//			}
//			System.out.println(a[i]);		
//		}
		
		
//		문제11 .컴퓨터에서 주사위던지는 프로그램을 구현하였을때 던져서 나온수의 빈도(회수)를 구하는
//		프로그램을 작성해 보자.
		
//		System.out.println("주사위 던질 횟수입력");
//		int a1=Integer.parseInt(new java.util.Scanner(System.in).nextLine());		
//		int num[]= {1,2,3,4,5,6};
//		int num1=0;
//		int num2=0;
//		int num3=0;
//		int num4=0;
//		int num5=0;
//		int num6=0;
//		for(int i=1;i<a1+1;i++) {
//			int a=(int)((Math.random()*6)+1);
//			if(num[0]==a) {
//				num1++;				
//			}
//			if(num[1]==a) {
//				num2++;				
//			}
//			if(num[2]==a) {
//				num3++;				
//			}
//			if(num[3]==a) {
//				num4++;				
//			}
//			if(num[4]==a) {
//				num5++;				
//			}
//			if(num[5]==a) {
//				num6++;				
//			}
//		}
//		System.out.println("1="+num1+"회 ,"+"2="+num2+"회 ,"+"3="+num3+"회 ,"+
//				"4="+num4+"회 ,"+"5="+num5+"회 ,"+"6="+num6+"회,");
//		
//		
//		int count=60000;
//		int result[]=new int[6];
//		
//		for(int i=0;i<count;i++) {
//			int num=(int)(Math.random()*6);
//			result[num]++;
//		}
//		
//		for(int i=0;i<result.length;i++) {
//			System.out.println("주사위"+(i+1)+"빈도수:"+result[i]);
//		}
//		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
