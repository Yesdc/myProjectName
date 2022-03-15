package com.human.ex1;

public class JavaClass03 {

	public static void main(String[] args) {

//			int i=1;//1,0,-1,기타
//			if(i==1) {
//				System.out.println("양수");
//			}else {
//				if(i==-1) {
//					System.out.println("음수출력");
//				}else {
//					if(i==0) {
//						System.out.println("0출력");
//					}else {
//						System.out.println("약속되지 않은 숫자");
//					}
//				}
//				
//			}
//			
//	이런경우를 대비해 else if문과 switch문이 나옴
//	switch double,범위조회 사용불가
			
			
//			문제1
//		int input=0;
//		int a=5;
//		int b=7;
//		if(input==0) {
//			a=a+2;
//		}else if(input==1) {
//			b=b+4;
//			
//		}else if(input==2) {
//			a=a+b;
//		}else {
//			b=b+5;
//		}
//		System.out.println(a+":"+b);	
			
		
//			문제2 점수를 입력받아 90점이상은 수, 80점이상은 우, 70점 이상은 미 ..로 출력하는
//			프로그램을 만들어 보자.
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("점수 입력");
//		int point=Integer.parseInt(sc.nextLine());
//		int result=point/10;
//		switch(result) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//		case 7:
//			   System.out.println("미");
//		break;
//		case 8:
//			   System.out.println("우");
//		break;
//		case 9:
//		case 10:
//			   System.out.println("수");
//		break;	   
//			   		   
//		}
			
			
//			문제3 1~5사이의 숫자를 입력받아 해당 숫자를 한글로 출력하는 프로그램을 작성해 보자.
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("1~5 입력");
//		int num1=Integer.parseInt(sc.nextLine());
//		switch(num1) {
//		case 1:
//			System.out.println("하나");
//			break;
//		case 2:
//			System.out.println("둘");
//			break;
//		case 3:
//			System.out.println("셋");
//			break;
//		case 4:
//			System.out.println("넷");
//			break;
//		case 5:
//			System.out.println("다섯");
//			break;	
//		}
			
			
//			문제4 달을 입력받아 해당달이 28일인지 30일인지 31일인지 출력하는 프로그램을 구현해
//		         보자.
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("달 입력");
//		int month=Integer.parseInt(sc.nextLine());
//		switch(month) {
//			case 1:
//				System.out.println("31일");
//			break;
//			case 2:
//				System.out.println("28일");
//			break;
//			case 3:
//				System.out.println("31일");
//			break;
//			case 4:
//				System.out.println("30일");
//			break;
//			case 5:
//				System.out.println("31일");
//			break;
//			case 6:
//				System.out.println("30일");
//			break;
//			case 7:
//				System.out.println("31일");
//			break;
//			case 8:
//				System.out.println("31일");
//			break;
//			case 9:
//				System.out.println("30일");
//			break;
//			case 10:
//				System.out.println("31일");
//			break;
//			case 11:
//				System.out.println("30일");
//			break;
//			case 12:
//				System.out.println("31일");
//			break;
//		}
			
			
//			 문제5 나이를 입력 받아 해당 나이의 때의 학력이 초,중,고 중 어디에 해당하는지
//		     출력해보자.
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("나이 입력");
//		int age=Integer.parseInt(sc.nextLine());
//	    	switch(age) {
//	    	case 1:
//	    	case 2:
//	    	case 3:
//	    	case 4:
//	    	case 5:
//	    	case 6:
//	    	case 7:
//	    		System.out.println("아동");
//	    		break;
//	    	case 8:
//	    	case 9:
//	    	case 10:
//	    	case 11:
//	    	case 12:
//	    	case 13:
//	    		System.out.println("학력:초");
//	    		break;
//	    	case 14:
//	    	case 15:
//	    	case 16:
//	    		System.out.println("학력:중");
//	    		break;
//	    	case 17:
//	    	case 18:
//	    	case 19:
//	    		System.out.println("학력:고");
//	    		break;
//	    	default:
//	    		System.out.println("성인");
//    		break;
//	    	}
//			
		
			
			
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		String input=sc.nextLine();
//		
//		switch(input) {
//		case "1": case "5": case "10": case "12":
//		case "3": case "7": case "8":
//			System.out.println("31");
//			break;
//		case "2":
//			System.out.println("28");
//			break;
//		case "4": case "6": case "9": case "11":
//			System.out.println("30");
//			break;
//		default:
//			System.out.println("알수없는달");
//		}
//			
			
		
//		int num=111;
//		String key="108호";
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("비밀번호 입력");
//		int numInput=Integer.parseInt(sc.nextLine());
//		System.out.println("key 입력");
//		String keyInput=sc.nextLine();
//		비밀번호가 111이고 key는 108호 키이다.
//		1둘다 입력해야 들어갈 수 있음
//		if(num==numInput&&key.equals(keyInput)) {
//		System.out.println("들어감");
//		}else {
//		System.out.println("못들어감");
//		}
		
		
//		2둘중에 하나만 입력해도 돌아갈 수 있음.
//		if(num==numInput||key.equals(keyInput)) {
//			System.out.print("들어감");
//		}else {
//			System.out.print("못들어감");
//		}
//		3비밀번호만 입력하면 들어갈 수 있음.
//		4키만 입력하면 들어갈 수 있음.
		
		
		
//		입력값에 따라 동일한 결과가 나오도록 조건식을 작성하자.
//		boolean isFlag1=true,isFlag2=false;//입력값
//		
//		if(isFlag1) {
//			if(isFlag2) {
//				System.out.println("틀림");//맞음//틀림//틀림
//			}else {
//				System.out.println("맞음");//맞음//틀림//맞음
//			}
//		}else {
//			if(isFlag2) {
//				System.out.println("맞음");//맞음//틀림//맞음
//				
//			}else {
//				System.out.println("맞음");//틀림//맞음//맞음
//			}
//		}
	

//		1번
//		if(isFlag1&&isFlag2) {
//		System.out.println("맞음"); //출력값이 상위 코드와 동일하게 동작하도록
//		}else {
//		System.out.println("틀림");				
//		}
	
//		2번
//		if(isFlag1||isFlag2) {
//		System.out.println("맞음"); //출력값이 상위 코드와 동일하게 동작하도록
//		}else {
//		System.out.println("틀림");				
//		}
	
//		3번
//		if(!(isFlag1||isFlag2)) {
//		System.out.println("맞음"); //출력값이 상위 코드와 동일하게 동작하도록
//		}else {
//		System.out.println("틀림");				
//		}
//		4번	
//		if(!(isFlag1&&isFlag2)) {
//		System.out.println("맞음"); //출력값이 상위 코드와 동일하게 동작하도록
//		}else {
//		System.out.println("틀림");				
//		}
		
//		문제1
//		int a=15;
//		if(a>14) {
//			System.out.println("true");
//		}
		
//		문제2
//		int a=10;
//		int b=25;
//		if(12>=a||b>22) {
//			System.out.println(true);
//		}
//		if(!(a>12&&22>=b)) {
//			System.out.println(true);
//		}
		
//		문제3 입력받은 수가 3의 배수 이거나 7의 배수이면
//		‘3또는 7의 배수’가 출력되고, 2의 배수도 되고
//		5의 배수도 되면 ‘2와 5의 배수’를 출력하고
//		두가지 경우 다 만족하면 2가지 다 출력하는
//		프로그램을 만들어 보자.
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.print("숫자입력");
//		int a=Integer.parseInt(sc.nextLine());
//		if((a%3==0)||(a%7==0)) { 
//			if((a%2==0)&&(a%5==0)) {
//				System.out.println("3또는 7의배수, 2와 5의배수");
//			}else {
//				System.out.println("3또는 7의배수");
//			}				
//		}else {
//			if((a%2==0)&&(a%5==0)) {
//				System.out.println("2와 5의배수");
//			}
//		}
		
		
		
//		문제4 왼쪽 이미지는 하나의 점이 x,y좌표를 가질때
//		위치할 수 있는 장소를 4개로 구분한 것이다. x,y가
//		모두 양수이면 2번 위치에 점이 존재하게 될것이고
//		22
//		모두 음수이면 4번위치에 점이 위치하게 될것이다. 해당 점의 좌표를 입력받아 해당 점이
//		어느 위치에 있는지 출력해 보자. x,y축 위에 있을 때는 x,y축 위에 있다고 출력하면 된다
				
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.print("x입력");
//		int x=Integer.parseInt(sc.nextLine());
//		System.out.print("y입력");
//		int y=Integer.parseInt(sc.nextLine());
//		
//		if((x>0)&&(y>0)) {
//			System.out.println("2번위치");
//		}else if((0>x)&&(y>0)) {
//			System.out.println("1번위치");
//		}else if((x>0)&&(0>y)) {
//			System.out.println("4번위치");
//		}else if((0>x)&&(0>y)) {
//			System.out.println("3번위치");
//		}
		
		
//		5.버스요금계산하는 프로그램을 구현해보자. 15세 이하는 1300원 초과는 1600원이고
//		버스카드로 결제하면 100원 할인해 준다.
//		문자열을 boolean형으로 변경하는 방법은 다음과 같다.
//		Boolean a= Boolean.parseBoolean("true");
//		입력: 16엔터 true엔터
//		출력: 버스요금은 1500원 입니다
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("나이 입력");
//		int age=Integer.parseInt(sc.nextLine());
//		System.out.println("버스카드 true or false");		
//		Boolean card=Boolean.parseBoolean(sc.nextLine());
//		
//		
//		if((15>=age)&&card) {
//			System.out.println("버스요금은 1200원 입니다");			
//		}else if(15>=age&&!card) {
//			System.out.println("버스요금은 1300원 입니다");			
//		}else if(age>15&&card) {
//			System.out.println("버스요금은 1500원 입니다");			
//		}else if(age>15&&!card) {
//			System.out.println("버스요금은 1600원 입니다");			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		6번  .int i=(new java.util.Date()).getDay();다음과 같이 기술하면 오늘의 요일이 i에
//		숫자로 들어간다. i가 0일 경우 일요일이고 일월화수목금토일은 0123456과 같다. i값을
//		가지고 오늘의 요일을 출력하는 프로그램을 만들어 보자.
//		int i=(new java.util.Date()).getDay();
//		if(i==0) {
//			System.out.println("일요일");
//		}else if(i==1) {
//			System.out.println("월요일");
//		}else if(i==2) {
//			System.out.println("화요일");
//		}else if(i==3) {
//			System.out.println("수요일");
//		}else if(i==4) {
//			System.out.println("목요일");
//		}else if(i==5) {
//			System.out.println("금요일");
//		}else if(i==6) {
//			System.out.println("토요일");
//		}
		
//		7번 한국사이즈를 입력받아 미국사이즈로 출력하시오.
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("한국사이즈 입력");
//		int size=Integer.parseInt(sc.nextLine());
//		if((size>=90)&&(95>size)) {
//			System.out.println("S");
//		}else if((size>=95)&&(100>size)) {
//			System.out.println("m");
//		}else if((size>=100)&&(105>size)) {
//			System.out.println("L");
//		}else if((size>=105)&&(110>size)) {
//			System.out.println("XL");
//		}else if(size>=110) {
//			System.out.println("XXL");
//		}
		
		
		
//		문제8 .java,html,db과목의 점수를 입력받아. 평균이 60점 이상이면 합격, 평균이 60점
//		미만이면 불합격, 40점 이하인 과목이 하나라도 있으면 과락이 출력되도록 프로그램을
//		구현해 보자. 최종결과 화면은 다음과 같다. 국어 35 과락, 수학 10과락 또는 총점 40로
//		60점미만 불합격 또는 총점 60이상 합격이 출력된다.
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("java 점수입력");
//		int java=Integer.parseInt(sc.nextLine());
//		System.out.println("html 점수입력");
//		int html=Integer.parseInt(sc.nextLine());
//		System.out.println("db 점수입력");
//		int db=Integer.parseInt(sc.nextLine());
//		double avr=(java*html*db)/3;
//		if(avr>=60) {
//			if((java>40)&(html>40)&(db>40)) {
//				System.out.println("평균 60이상 합격");
//			}else if((40>=java)&(40>=html)&(40>db)) {
//				System.out.println("java"+java+"점 과락"+" html"+html+"점 과락"+" db"+db+"점 과락");
//			}else if((40>=java)&(40>=html)) {
//				System.out.println("java"+java+"점 과락"+" html"+html+"점 과락");
//			}else if((40>=java)&(40>db)) {
//				System.out.println("java"+java+"점 과락"+" db"+db+"점 과락");
//			}else if((40>=html)&(40>db)) {
//				System.out.println("html"+html+"점 과락"+" db"+db+"점 과락");					
//			}else if(40>=java) {
//				System.out.println("java"+java+"점 과락");
//			}else if(40>=html) {
//				System.out.println("html"+html+"점 과락");
//			}else if(40>db) {
//				System.out.println("db"+db+"점 과락");
//			}
//								
//		}else {
//			System.out.println("평균 60미만 불합격");
//		}
		
		
		
//		문제5
//		a 밥을 먹었으면 ‘밥을 먹었음’ 이 출력 되고 밥을 먹지 않았으면 아무것도 출력되지
//		않음.
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("밥 yes or no");
//		String rice=sc.nextLine();
//		if(rice.equals("yes")) {
//			System.out.println("밥을 먹었음");
//		}
		
//		b. 빵을 먹었으면 ‘빵을 먹었음’이 출력되고 빵을 먹지 않았으면 ‘밥을 먹었음’이 출력됨
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("빵 yes or no");
//		String bread=sc.nextLine();
//		if(bread.equals("yes")) {
//			System.out.println("빵을 먹었음");
//		}else {
//			System.out.println("밥을 먹었음");			
//		}
		
//		c  밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘빵을 먹었음’이 출력되도록 구현.
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("밥 yes or no");
//		String rice=sc.nextLine();
//		if(rice.equals("yes")) {
//			System.out.println("밥을 먹었음");
//		}else {
//			System.out.println("빵을 먹었음");			
//		}
		
//		d 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘아무것도 안먹었음’이 출력 되도록 구현.
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("밥 yes or no");
//		String rice=sc.nextLine();
//		if(rice.equals("yes")) {
//			System.out.println("밥을 먹었음");
//		}else {
//			System.out.println("아무것도 안먹었음");			
//		}
		
//		e 식사로 ‘밥’과 ‘빵’이 있고 후식으로 국,우유, 아이스크림, 커피가 있는데 밥을 먹으면
//		국과 아이스크림중 하나를 빵을 먹으면 우유 커피 중 하나를 후식으로 먹을수 있다.
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("밥or빵");
//		String rice=sc.nextLine();
//		if(rice.equals("밥")) {
//			System.out.println("국or아이스크림");
//		}else if(rice.equals("빵")){
//			System.out.println("우유or커피");			
//		}
		
		
		
		
//		System.out.println("나이를 입력하세요");
//		int age=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("교통카드 유무?");
//		boolean isCard=Boolean.parseBoolean(new java.util.Scanner(System.in).nextLine());
//		int change=0;
//		if(age<15) {
//			change=1300;			
//		}else {
//			change=1600;
//		}
//		if(isCard) {
//			change=change-100;
//		}
//		System.out.println(change);
		
		
		
		
		
//		int rr=(int)(Math.random()*3)+6;
//		System.out.println(rr);
//		
//		System.out.println((int)Math.random()*10);
//		
		
		
//		9번
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("학생or성인");
//		String age=sc.nextLine();
//		System.out.println("키");
//		double hei=Double.parseDouble(sc.nextLine());
//		System.out.println("몸무게");
//		double wei=Double.parseDouble(sc.nextLine());
//		double bmi=(wei/(hei-100)*0.9)*100;
//		
//		if(age.equals("학생")) {
//			if(95>bmi) {
//				System.out.println("체중미달");
//			}else if((bmi>=95)&&(120>bmi)) {
//				System.out.println("정상");
//			}else if((bmi>=120)&&(130>bmi)) {
//				System.out.println("경도비만");
//			}else if((bmi>=130)&&(150>bmi)) {
//				System.out.println("중도비만");
//			}else if((bmi>=150)) {
//				System.out.println("고도비만");
//			}
//		}else {
//			
//		}
//		if(age.equals("성인")) {
//			if(100>bmi) {
//				System.out.println("체중미달");
//			}else if((bmi>=100)&&(110>bmi)) {
//				System.out.println("정상");
//			}else if((bmi>=110)&&(120>bmi)) {
//				System.out.println("경도비만");
//			}else if((bmi>=120)&&(150>bmi)) {
//				System.out.println("중도비만");
//			}else if((bmi>=150)) {
//				System.out.println("고도비만");
//			}
//		}else {
//			
//		}
		
		
		
//		10번  다음 표를 확인하여 사용자가 알고 있는 신체사이즈중 하나를 입력받아 해당
//		미국사이즈와 한국사이즈를 출력하시오.
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("목,가슴,팔길이,허리 선택");
//		String choice=sc.nextLine();
//		System.out.println("사이즈 입력");
//		double size=Double.parseDouble(sc.nextLine());
//		if(choice.equals("목")) {
//			if((size>=33)&&(35>=size)) {
//				System.out.println("미국사이즈 s, 한국사이즈 90~95");
//			}else if((size>=36)&&(37>=size)) {
//				System.out.println("미국사이즈 m, 한국사이즈 95~100");
//			}else if((size>=38)&&(39>=size)) {
//				System.out.println("미국사이즈 L, 한국사이즈 100~105");
//			}else if((size>=41)&&(42>=size)) {
//				System.out.println("미국사이즈 XL, 한국사이즈 105~120");
//			}else if((size>=43)&&(45>=size)) {
//				System.out.println("미국사이즈 XXL, 한국사이즈 110이상");
//			}
//		}else {
//		
//		}
//		if(choice.equals("가슴")) {
//			if((size>=86)&&(91>=size)) {
//				System.out.println("미국사이즈 s, 한국사이즈 90~95");
//			}else if((size>=96)&&(102>=size)) {
//				System.out.println("미국사이즈 m, 한국사이즈 95~100");
//			}else if((size>=107)&&(112>=size)) {
//				System.out.println("미국사이즈 L, 한국사이즈 100~105");
//			}else if((size>=117)&&(122>=size)) {
//				System.out.println("미국사이즈 XL, 한국사이즈 105~120");
//			}else if((size>=127)&&(132>=size)) {
//				System.out.println("미국사이즈 XXL, 한국사이즈 110이상");
//			}
//		}else {
//		
//		}
//		if(choice.equals("팔")) {
//			if((size>=78)&&(81>=size)) {
//				System.out.println("미국사이즈 s, 한국사이즈 90~95");
//			}else if((size>=81)&&(84>=size)) {
//				System.out.println("미국사이즈 m, 한국사이즈 95~100");
//			}else if((size>=85)&&(86>=size)) {
//				System.out.println("미국사이즈 L, 한국사이즈 100~105");
//			}else if((size>=87)&&(89>=size)) {
//				System.out.println("미국사이즈 XL, 한국사이즈 105~120");
//			}else if((size>=90)&&(91>=size)) {
//				System.out.println("미국사이즈 XXL, 한국사이즈 110이상");
//			}
//		}else {
//		
//		}
//		if(choice.equals("허리")) {
//			if((size>=28)&&(29>=size)) {
//				System.out.println("미국사이즈 s, 한국사이즈 90~95");
//			}else if((size>=30)&&(31>=size)) {
//				System.out.println("미국사이즈 m, 한국사이즈 95~100");
//			}else if((size>=32)&&(34>=size)) {
//				System.out.println("미국사이즈 L, 한국사이즈 100~105");
//			}else if((size>=35)&&(37>=size)) {
//				System.out.println("미국사이즈 XL, 한국사이즈 105~120");
//			}else if((size>=38)&&(40>=size)) {
//				System.out.println("미국사이즈 XXL, 한국사이즈 110이상");
//			}
//		}else {
//		
//		}
		
		
//		11번 다음과 같이 실행되는 계산기 프로그램을 만들어보자.
//		첫번째수 입력>>5, 연산자선택 1. + 2. - 3. * 4. / >>3 두번째수 입력>>12
//		5*12=60 입니다.
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("첫번째수 입력");
//		int num1=Integer.parseInt(sc.nextLine());
//		System.out.println("연산자선택 1. + 2. - 3. * 4. /");
//		int num2=Integer.parseInt(sc.nextLine());
//		System.out.println("두번째수 입력");
//		int num3=Integer.parseInt(sc.nextLine());
//		int result=0;
//		if(num2==1) {
//			result=num1+num3;
//		}else {
//			
//		}
//		if(num2==2) {
//			result=num1-num3;
//		}else {
//			
//		}
//		if(num2==3) {
//			result=num1*num3;
//		}else {
//			
//		}
//		if(num2==4) {
//			result=num1/num3;
//		}else {
//			
//		}
//		
//		System.out.println("계산결과="+result);
		
		
		
		
//		12번
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("가위,바위,보 입력");
//		String game=sc.nextLine();
//		int Ran=(int)(Math.random()*3);
//		if((Ran==0)&&(game.equals("가위"))) {
//			System.out.println("무승부");
//		}else if((Ran==0)&&(game.equals("바위"))){
//			System.out.println("승리");
//		}else if((Ran==0)&&(game.equals("보"))){
//			System.out.println("패배");
//		}else if((Ran==1)&&(game.equals("가위"))){
//			System.out.println("패배");
//		}else if((Ran==1)&&(game.equals("바위"))){
//			System.out.println("무승부");
//		}else if((Ran==1)&&(game.equals("보"))){
//			System.out.println("승리");
//		}else if((Ran==2)&&(game.equals("가위"))){
//			System.out.println("승리");
//		}else if((Ran==2)&&(game.equals("바위"))){
//			System.out.println("패배");
//		}else if((Ran==2)&&(game.equals("보"))){
//			System.out.println("무승부");
//		}
		
		
		
//		13번 6~10사이의 램덤한 수를 만들어 보자. 총 수에 범위는 6,7,8,9,10 5개 이므로 랜덤
//		함수에 5를 곱하고 시작을 6부터 하니 더하기 6를 하면 될 것이다. 제대로 동작하는지
//		확인해 보자.
		
//		int random=(int)((Math.random()*5)+6);
//		System.out.println(random);
		
		
//		14번 1~45까지의 수를 랜덤하게 만들어보자.
//		int random=(int)((Math.random()*45)+1);
//		System.out.println(random);
		
//		15번 가위,바위,보 문자열중 하나를 랜덤하게 화면에 출력하는 프로그램을 구현해보자.하나를
//		내는 것 처럼 구현 하려면 0,1,2 3개의 수를 랜덤하게 리턴하게 만든 다음 가위,바위,보
//		3개에 1:1 매핑하면 된다.

//		int random=(int)((Math.random()*3)+1);
//		if(random==1) {
//			System.out.println("가위");
//		}else if(random==2) {
//			System.out.println("바위");
//		}else if(random==3) {
//			System.out.println("보");
//		}
		
		
//		16번 왼쪽표를 기본으로 본인이
//		낼 새금이 얼마인지 출력하는
//		프로그램을 구현해 보자.
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("소득 입력(단위:만원)");
//		int income=Integer.parseInt(sc.nextLine());
//		double tex=0;
//		double rate1=0.06;
//		double rate2=0.15;
//		double rate3=0.24;
//		double rate4=0.35;
//		double rate5=0.38;
//		double rate6=0.40;
//		double rate7=0.42;
//						
//		
//		if(1200>=income) {
//			tex=income*0.06;
//		}else if((income>1200)&&(4600>=income)) {
//			tex=(income*rate2)-108;
//		}else if((income>4600)&&(8800>=income)) {
//			tex=(income*rate3)-522;
//		}else if((income>8800)&&(15000>=income)) {
//			tex=(income*rate4)-1490;
//		}else if((income>15000)&&(30000>=income)) {
//			tex=(income*rate5)-1940;
//		}else if((income>30000)&&(50000>=income)) {
//			tex=(income*rate6)-2540;
//		}else if(income>50000) {
//			tex=(income*rate7)-3540;
//		}
//	
//		System.out.println("낼 세금="+tex+"만원");
//		ee
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}		
		
		
		
		
	}




