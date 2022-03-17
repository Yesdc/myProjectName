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
//		System.out.println("첫번째 수");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("두번째 수");
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
		System.out.println("첫번째 수");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
		System.out.println("두번째 수");
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
		System.out.println("첫번째 수");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
		System.out.println("두번째 수");
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		for(int i=1;i>=1;i++) {
//			
//			if((i%a==0)&&(i%b==0)) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		
//		문제8 3개의 수를 입력 받아 가장 작은 수와 가장 큰수를 출력하는 프로그램을 만들어 보자.
//		System.out.println("첫번째 수");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("두번째 수");
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("세번째 수");
//		int c=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		for(int i=a+b+c;i>=0;i--) {
//			if(i-a==0) {
//				System.out.println("가장큰수="+a);
//				break;
//			}else if(i-b==0) {
//				System.out.println("가장큰수="+b);
//				break;
//			}else if(i-c==0) {
//				System.out.println("가장큰수="+c);
//				break;
//			}
//		}
//		for(int i=0;i>=0;i++) {
//			if(i-a==0) {
//				System.out.println("가장작은수="+a);
//				break;
//			}else if(i-b==0) {
//				System.out.println("가장작은수="+b);
//				break;
//			}else if(i-c==0) {
//				System.out.println("가장작은수="+c);
//				break;
//			}
//		}
		
		
//		문제9 100이하의 수학과목 점수를 5번 입력받아 60이하 탈락자가 몇명인지 출력하는 프로그램을
//		구현해 보자.
//		int a=0;
//		int b=0;
//		for(int i=1;i<6;i++) {
//			a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//			if(60>=a) {
//				b++;
//			}
//		}
//		System.out.println("탈락자="+b+"명");
		
		
//		문제10 1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지 누적한 결과값을 순서대로
//		출력하시오. 1:1 2:3 3:6 4:10 5:15 6:21 … 100이전의 총합들을 다음과 같이 출력되면
//		된다.
//		int sum=0;
//		for(int i=1;i>=0;i++) {
//			if(sum>90) {
//				break;
//			}
//			sum=sum+i;
//			System.out.println(i+":"+sum);
//			
//		}

		
//		문제11 문자열과 숫자를 입력받아 입력받은 문자열을 숫자만큼 출력하는 프로그램을 만들어
//		보자.
//		System.out.println("문자열 입력");
//		String a=new java.util.Scanner(System.in).nextLine();
//		System.out.println("숫자입력");
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		for(int i=1;i<b+1;i++) {
//			System.out.println(a);
//		}
		
		
//		문제12  입력받은 두수 사이의 숫자들의 합을 구하는 프로그램을 만들어 보자.
//		System.out.println("첫번째 수");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("두번째 수");
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int sum=0;
//		
//		if(a-b<0) {					
//			for(int i=a+1;i<b;i++) {
//				sum=sum+i;
//			}				
//		}else {
//			for(int i=b+1;i<a;i++) {
//				sum=sum+i;
//		}			
//		}
//		System.out.println(sum);
		
		
//		문제13 소수는 1과 자기 자신만으로 나누어지는 수이다. 2,3,5같은 경우 1과 본인 자신만으로
//		나누어지므로 소수이다. 수를 하나 입력받아 소수인지 아닌지 판별하는 프로그램을
//		구현하시오.
//		System.out.println("수 입력");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int result=0;
//		int sum=0;
//		String T="0";
//			for(int i=2;i<a;i++) {
//				result=a%i;
//				if(result==0) {
//					T="소수아님";
//					System.out.println(T);
//					break;
//				}
//					
//			}
//		if(T.equals("0")) {
//			System.out.println("소수");
//		}
		
		
//		문제14 두 수를 입력 받아 첫 번째수 부터 시작하여 하나씩 카운트하여 두번째수 만큼 화면에
//		출력 하는 프로그램을 만든다. 5 6를 입력 받으면 5부터 6개 5 6 7 8 9 10 이 화면에 출력
//		된다.
//		System.out.println("첫번째수");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("두번째수");
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		for(int i=1;i<b+1;i++) {
//			System.out.println(a);
//			a++;			
//		}
				
			
//		문제15 사용자가 “종료”를 입력할때 까지 무한 반복하는 프로그램을 3가지 방법으로
//		구현하시오.	
//15-1	
//		System.out.println("종료 입력>>");
//		String a=new java.util.Scanner(System.in).nextLine();	
//		for(int i=0;i>=0;i++) {			
//			System.out.println(i);
//			if(a.equals("종료")) {
//				break;
//			}
//		
//		}
		
//15-2	
//		System.out.println("종료 입력>>");
//		String a=new java.util.Scanner(System.in).nextLine();
//		int i=0;
//		while(i>=0) {
//			System.out.println(i);
//			if(a.equals("종료")) {
//				break;
//			}
//			i++;
//		}
		
		
//15-3	
//		System.out.println("종료 입력>>");
//		String a=new java.util.Scanner(System.in).nextLine();
//		int i=0;
//		do {
//			System.out.println(i);
//			if(a.equals("종료")) {
//				break;
//			}
//			i++;
//		}while(i>=0);	
		
		
		
		
//		문제16 1~9 사이의 숫자를 하나 입력받아 해당 숫자의 구구단을 출력하여 보자.
//		System.out.println("숫자입력");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int result=0;
//		for(int i=1;i<10;i++) {
//			result=a*i;
//			System.out.println(a+"X"+i+"="+result);
//		}
		
		
//		문제17 숫자를 하나 입력받아 1~1000사이에 입력받은 숫자의 배수가 몇 개인지 출력하는
//		프로그램을 만들어 보자.
//		System.out.println("숫자입력");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int result=0;
//		int b=0;
//		for(int i=1;i<10001;i++) {
//			result=i%a;
//			if(result==0) {
//				b++;
//			}
//		}
//		System.out.println(b);
		
		
//		문제18 사용자에게 행과 열을 입력받아 행과 열에 맞춰서 1부터 100까지 출력하는 프로그램을
//		구현해 보자.
//		System.out.println("행");
//		int a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("열");
//		int b=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		for(int i=1;i<101;i++) {
//			System.out.print(i);
//			if(i%a==0) {
//				System.out.println("");
//			}
//		}
		
		
//		문제19  컴퓨터가 던진 동전이 앞면 인지 뒷면 인지 맞추는 프로그램을 구현해 보자. 맞춘
//		회수와 틀린 회수를 기록해서 보여주고 3번 맞추면 프로그램이 종료되게 만들자.
//		System.out.print("앞:1 뒤:2");
//		int a=0;
//		int b=(int)((Math.random()*2)+1);
//		int good=0;
//		int bad=0;
//		for(int i=good;i>=0;i++) {
//			a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//			if(a==b) {
//				good++;
//				System.out.println("맞춤");
//			}else {
//				bad++;
//				System.out.println("틀림");
//			}
//			System.out.println("맞춘횟수="+good+" 틀린횟수="+bad);
//			if(good==3) {
//				break;
//			}
//		}
//		System.out.println("종료");
		
		
//		문제20 컴퓨터가 던진 주사위 수를 맞추는 프로그램을 구현해 보자. 10회 맞추어 맞춘 회수와
//		틀린 회수를 기록해서 보여 주자.
//		System.out.println("주사위 맞추기");
//		int a=0;
//		int b=(int)((Math.random()*6)+1);
//		int good=0;
//		int bad=0;
//		for(int i=1;i<11;i++) {
//			a=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//			if(a==b) {
//				good++;
//				
//			}else {
//				bad++;
//			}
//		System.out.println("맞춘횟수="+good+" 틀린횟수"+bad);	
//		}
//		System.out.println("10회 끝");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
