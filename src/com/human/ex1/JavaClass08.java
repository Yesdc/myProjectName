package com.human.ex1;

public class JavaClass08 {

	public static void main(String[] args) {
		
//		int a=1;
//		if(a==1) {
//			System.out.println(a);
//		}else if(a==2){
//			System.out.println("B");
//		}else if(a==2){
//			System.out.println("B");
//		}else {
//			System.out.println("default");
//		}
//		
//		switch(a) {
//		case 1:
//			System.out.println(a);
//		break;
//		case 2:
//		case 3:
//			System.out.println("good");
//		break;
//		default:
//			System.out.println("default");
//		
//		}
//		
//		5~20사이의 3의 배수의 함
//		int sum=0;
//		for(int i=5;i<21;i++) {
//			if(i%3==0) {
//				sum=sum+i;
//			}
//		}
//		System.out.println(sum);
//	
//		int sum=0;
//		int i=5;
//		while(i<=20) {
//		
//			
//			
//			i++;
//			
//		}
		
		
//		String inputString="9";
//		for(;!(inputString.equals("-1"));) {
//			System.out.println("전체메뉴:1 1번메뉴:2 2번메뉴:3 0:종료");
//			inputString=new java.util.Scanner(System.in).nextLine();
//			if(inputString.equals("1")) {
//				System.out.println("1번메뉴");
//			}else if(inputString.equals("2")) {
//				System.out.println("2번메뉴");
//			}else if(inputString.equals("3")) {
//				System.out.println("3번메뉴");
//			}else if(inputString.equals("0")) {
//				System.out.println("메뉴 종료");
//			}else {
//				System.out.println("잘못입력");
//			}			
//		}
//		
//		System.out.println("프로그램 종료");
		
		
//		문제0번 50명의 학생의 출석 사항을 처리하는 프로그램을 만들어 보자.

//		String check="99";
//		boolean student[]=new boolean[50];
//		int num=0;
//		
//		for(;!(check.equals("6"));) {
//			System.out.println("1.전체 출력사항 2.결석자 추가 3.출석자 추가 6.프로그램 종료");
//			check=new java.util.Scanner(System.in).nextLine();
//			if(check.equals("1")) {
//				for(int i=0;i<50;i++) {
//					if(student[i]==true) {
//						System.out.println(i+"번=출석");
//					}else if(student[i]==false) {
//						System.out.println(i+"번=결석");
//					}
//				}
//			}else if(check.equals("2")) {	
//				System.out.println("번호입력");
//				num=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//				student[num-1]=false;				
//			}else if(check.equals("3")) {
//				System.out.println("번호입력");
//				num=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//				student[num-1]=true;				
//			}
//		}
//		System.out.println("프로그램 종료");
		
		
//		문제1번 은행 프로그램을 순서도와 프로그래밍 언어로 만들어보자.
//		은행 프로그램의 메뉴는 다음과 같다. ‘전체메뉴: 1.입금 2.출금 3.조회 0.종료’
		
//		int account=0;
//		int menu=99;
//		int input=0;
//		int output=0;
//		int money=0;
//		for(;!(menu==0);) {
//			System.out.println("전체메뉴: 1.입금 2.출금 3.조회 0.종료");
//			menu=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//			if(menu==1) {
//				System.out.println("입금액 입력");
//				input=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//				money=money+input;
//			}else if(menu==2) {
//				System.out.println("출금액 입력");
//				output=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//				money=money-output;
//			}else if(menu==3) {
//				System.out.println("현재잔액="+money+"원");
//			}
//		}	
//		System.out.println("종료");
		
		
//		문제2 금액을 입력받아 천원, 오백원, 백원, 오십원, 십원 짜리 잔돈으로 거슬러주는
//		프로그램과 순서도을 구현해 보자.  예제 금액을 1000으로 나눈 몫은 돈을 거슬러 주었을때
//		천원짜리 개수 이고 1000으로 나눈 나머지는 천원짜리로 환산하고 남은 잔돈이다. 10원
//		이하는 입력받지 않는다. 최종 결과물은 다음과 같이 될 것이다. 5820원을 잔돈으로 바꾸면
//		천원짜리 5개, 오백원짜리 1개, 백원짜리 3개, 오십원짜리 0개,십원짜리 2개
//		선언할 변수:change1000,change500,change100,change50,change10,moneyInput
//		출력값:p(“천원짜리 “+change1000+”개, 오백원짜리 “+change500+”개, 백원짜리”+
//				change100+”개, 오십원짜리 “+change50+”개, 십원짜리 “+change10개)
		
//		System.out.println("거슬러받을돈 입력");
//		int money=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		int change1000=money/1000;
//		int change500=(money%1000)/500;
//		int change100=((money%1000)%500)/100;
//		int change50=(((money%1000)%500)%100)/50;
//		int change10=((((money%1000)%500)%100)%50)/10;
//		System.out.println("천원짜리"+change1000+"개,"+"오백원짜리"+change500+"개,"+"백원짜리"+change100+"개,"+
//				"오십원짜리"+change50+"개,"+"십원짜리"+change10+"개,");
		
			
//		문제3 실존하는 자판기와 동일하게 만들어 보자. 문자열 변수를 처리하려면 int 가 아닌
//		String 자료형을 사용해서 선언해야 한다.
//		int drink=99;
//		String str="";
//		int money=0;
//		for(;!(drink==6);) {
//			System.out.println("남은돈 "+money+"원"+"\n"+
//					"1.사이다 700 2.콜라 500 3.환타 350 4. 100원투입 5.500투입 6.반환");
//			drink=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//			if(drink==1) {
//				money=money-700;
//				str=str+"사이다";
//			}else if(drink==2) {
//				money=money-500;
//				str=str+"콜라";
//			}else if(drink==3) {
//				money=money-350;
//				str=str+"환타";
//			}else if(drink==4) {
//				money=money+100;
//			}else if(drink==5) {
//				money=money+500;
//			}
//		}
//		if(money>0) {
//			int change1000=money/1000;
//			int change500=(money%1000)/500;
//			int change100=((money%1000)%500)/100;
//			int change50=(((money%1000)%500)%100)/50;
//			int change10=((((money%1000)%500)%100)%50)/10;
//			System.out.println(str+" 천원짜리"+change1000+"개,"+"오백원짜리"+change500+"개,"+"백원짜리"+change100+"개,"+
//					"오십원짜리"+change50+"개,"+"십원짜리"+change10+"개,");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
