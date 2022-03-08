package com.human.ex;

public class MyClass3 {

	public static void main(String[] args) {

		//문제1 세로와 가로를 입력 받아 사각형의 넓이를 만드는 순서도와 프로그램을 만들어 보자.
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("세로길이>>");		
		String st=sc.nextLine();
		int k=Integer.parseInt(st);
				
		System.out.print("가로길이>>");		
		String st1=sc.nextLine();
		int j=Integer.parseInt(st1);
		
		System.out.println(k*j);
		
		
		//문제2 세로 가로 높이를 입력 받아 사각기둥의 부피를 만드는 순서도와 프로그램을 만들어
		//보자.

		
		
		System.out.print("세로길이>>");		
		String st2=sc.nextLine();
		int n=Integer.parseInt(st2);
				
		System.out.print("가로길이>>");		
		String st3=sc.nextLine();
		int m=Integer.parseInt(st3);		
		
		System.out.print("높이>>");		
		String st4=sc.nextLine();
		int b=Integer.parseInt(st4);
		
		System.out.println(n*m*b);
		
		//문제3  a 센치미터가 몇 미터 몇 센치인지 출력하는 프로그램을 구현 하시오
		
		
		System.out.print("CM>>");		
		String st5=sc.nextLine();
		int CM=Integer.parseInt(st5);
		System.out.println(0.01*CM+"m");
		
		
		//문제4 잔디의 가격은 1 제곱 미터에 a원일 때 윗변이 b,아래변이 c, 높이d인 사다리꼴에
		//잔디를 심으려면 얼마의 비용이 드는지 구하는 순서도를 작성하시오.
		
		
		System.out.print("윗변길이>>");		
		String st6=sc.nextLine();
		int Z=Integer.parseInt(st6);		
		
		System.out.print("아랫변길이>>");		
		String st7=sc.nextLine();
		int X=Integer.parseInt(st7);		
		
		System.out.print("높이>>");		
		String st8=sc.nextLine();
		int C=Integer.parseInt(st8);
		System.out.println((Z+X)*C/2+"*a원");
		
		
		//문제5 이름 나이 키를 입력받은 화면에 출력하는 프로그램을 작성해 보자. 출력결과:
		//당신의 이름은 홍길동 입니다.당신의 나이는 23입니다. 당신의 키는 165.5 입니다.
			
		System.out.println("이름");
		String st9=sc.nextLine();
						
		System.out.println("나이");
		String st10=sc.nextLine();
		int R=Integer.parseInt(st10);
				
		System.out.println("키");
		String st11=sc.nextLine();
		int H=Integer.parseInt(st11);
		
		System.out.println("당신의 이름은 "+st9+" 입니다."+"당신의 나이는 "+R+"입니다. 당신의 키는 "+H+" 입니다.");
		
		
		//문제6  두수를 입력받아 두수의 차를 출력하는 프로그램을 작성해보자.
				
		System.out.println("기준숫자");
		String st12=sc.nextLine();
		int Q=Integer.parseInt(st12);
						
		System.out.println("뺄수");
		String st13=sc.nextLine();
		int Y=Integer.parseInt(st13);
		
		System.out.println(Q-Y);
		
	
		//문제7 다음은 국어,영어,수학 점수를 입력 받아 평균을 구하여 다음과 같이 출력하는
		//프로그램을 만들어보자. 출력결과: 국어:80 영어:70 수학:90 평균:80
		
		
		System.out.println("국어점수");
		String st14=sc.nextLine();
		int P1=Integer.parseInt(st14);
				
		System.out.println("영어점수");
		String st15=sc.nextLine();
		int P2=Integer.parseInt(st15);
				
		System.out.println("수학점수");
		String st16=sc.nextLine();
		int P3=Integer.parseInt(st16);
		
		System.out.println((P1+P2+P3)/3);
		
		
		//문제8 키를 m로 소수점 2째 자리까지 입력받아 cm로 바꿔주는 프로그램을 만들어 보자.
	
		
		System.out.println("키(m)");
		String st17=sc.nextLine();
		double Z4=Double.parseDouble(st17);
		System.out.println(Z4*100+"cm");
		 
		
		//문제9 상장의 가로, 세로, 높이를 입력받아 부피를 구하는 프로그램을 만들어 보자.
				
		
		System.out.println("가로");
		String st18=sc.nextLine();
		int X3=Integer.parseInt(st18);
				
		System.out.print("세로");
		String st19=sc.nextLine();
		int X1=Integer.parseInt(st19);
				
		System.out.println("높이");
		String st20=sc.nextLine();
		int X2=Integer.parseInt(st20);
		
		System.out.println(X3*X1*X2);
		
		
		//문제10 연필 한박스에 12자루의 연필이 들어 있고 연필 1자루는 1000원 이다. 소비자가 몇
//		박스의 연필과 몇자루의 연필을 구매할 것인지 입력 받아 계산해주는 프로그램을 만들어보자.
		
	
		System.out.print("구매할 박스수");
		String st21=sc.nextLine();
		int V=Integer.parseInt(st21);
		
		System.out.println(V*12000+"원");
				
		System.out.println("구매할 자루수");
		String st22=sc.nextLine();
		int V1=Integer.parseInt(st22);
		
		System.out.println(V1/12*12000+"원");

		
		
		java.util.Scanner sc1=new java.util.Scanner(System.in);
		System.out.println("구매할 초콜릿갯수>>");
		String st33=sc1.nextLine();
		int Y3=Integer.parseInt(st33);
		
		System.out.print(Y3*1100+"원 입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
