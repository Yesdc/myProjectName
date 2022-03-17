package com.human.ex1;

public class JavaClass06 {

	public static void main(String[] args) {
//		문제0 do while,while,for문을 이용하여 3~10사이의 수를 모두 출력하시오. 9~30사이
//		숫자들의 합을 구하시오.
		
//		int i=3;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<11);
		
//		int i=3;
//		while(i<11) {
//			System.out.println(i);
//			i++;
//		}
		
//		for(int i=3;i<11;i++) {
//			System.out.println(i);
//		}
	
//		int i=9;
//		int result=0;
//		do {
//			result=result+i;	
//			i++;
//		}while(i<31);
//		System.out.println(result);
		
//		int i=9;
//		int result=0;
//		while(i<31) {
//			result=result+i;
//			i++;
//		}
//		System.out.println(result);
		
//		int result=0;
//		for(int i=9;i<31;i++) {
//			result=result+i;
//		}
//		System.out.println(result);
		
		
//		문제1 while문과 for문을 이용해서 다음페이지 왼쪽 순서도를 프로그램으로 구현해 보자.
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+" "+b);
//		while(b<15) {
//			a=a+1;
//			b=b+a;
//		}
//		System.out.println(a+" "+b);
		
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+" "+b);
//		for(b=2;b<15;b=b+a) {
//			a=a+1;
//			
//		}
//		System.out.println(a+" "+b);
		
		
//		문제2 어떤 수가 나누어 떨어지는 다른 수를 약수라고 한다. 100을 2로 나누면 0이된다.
//		따라서, 2는 100의 약수이다. 100의 모든 약수를 구하려면 100보다 크면 더 이상 나눌수
//		없으니 1~100사이의 모든 약수를 구하면 된다.
//		int a=100;
//		int b=0;
//		for(int i=1;i<100;i++) {
//			b=a%i;
//			if(b==0) {
//				System.out.println(i);
//			}
//		}
		
		
//		문제3 두 수를 입력받아 두수의 공통된 약수를 모두 출력해 보자. 0부터 하나씩 증가시키며 두수
//		모두 나눠지는 수를 출력하면 된다. 출력된 수중에서 가장 큰수를 입력받은 두수의
//		최대공약수라고 한다.
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		for(int i=1;i>0;i++) {
//			if((a%i==0)&&(b%i==0)) {
//				System.out.println(i);
//			}
//			if((i>a)&&(i>b)) {
//				break;
//			}
//		}
		
		
//		문제4 두수를 입력받아 두수의 최대 공약수를
//		구하는 프로그램을 만들어 보자.
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		
//		for(int i=a;i>=0;i--) {
//			if((a%i==0)&&(b%i==0)) {				
//				System.out.println(i);
//				break;
//			}
//									
//		}
		
		
//		문제5 사용자에게 숫자를 하나 입력받아 입력한
//		숫자들의 합이 100이 될때까지 계속입력을
//		받다가 100이 넘으면 합산을 출력하는
//		프로그램을 구현해보자.
		
//		int a=0;		
//		int sum=0;
//		for(int i=0;i>=0;i++) {
//			a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());			
//			sum=sum+a;			
//			if(sum>=100) {
//				System.out.println(sum);
//				break;
//			}
//		}
		
		
//		문제6 사용자에게 계속해서 숫자를 입력받아
//		1~10사이의 숫자를 3번 입력 할 때 까지
//		반복한다. 입력이 끝나면 잘못 입력한 회수와
//		제대로 입력한 회수를 출력하고 사용자가
//		제대로 입력한 총합을 출력하는 프로그램을
//		만들어 보자.
//		int sum=0;
//		int a=0;
//		int b=0;		
//		for(a=0;a<3;) {
//			int c=Integer.parseInt(new java.util.Scanner(System.in).nextLine()); 	
//			if((c>0)&&(10>=c)) {
//				sum=sum+c;
//				a++;				
//			}else {
//				b++;
//			}
//			if(a==3) {
//				System.out.println("잘못 입력한 횟수="+b+" 제대로 입력한 횟수="+a+" 제대로 입력한 총합="+"sum");
//			}			
//		}
		
		
//		문제7  두수를 입력 받아 공배수 중 가장 작은 배수를 최소
//		공배수를 출력하는 프로그램을 만들어 보자. 1 부터 하나씩 증가시켜 입력 받은 두수가 모두
//		0으로 나누어 떨어지는 수들은 공배수 이고 이중 가장 먼저 찾은 수가 가장 작은 수이므로
//		처음 찾은수가 최소 공배수이다.
//		int result1=0;
//		int result2=0;
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		for(int i=1;i>=1;i++) {
//			
//			if((i%a==0)&&(i%b==0)) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		
//		문제8 3개의 수를 입력 받아 가장 작은 수와 가장 큰수를 출력하는 프로그램을 만들어 보자.
		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
		int c=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
		for(int i=a+b+c;i>=0;i--) {
			if(i-a==0) {
				System.out.println(false);
			}
		}ff
		
		
		
	}

}
