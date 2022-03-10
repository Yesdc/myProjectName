package com.human.ex;

//클래스 관련있는 변수를 묶어서 프로그램으로 구현한것
//클래스 관련있는 변수와 메소드를 묶어서 프로그램으로 구현한것
//이것 저것 다 묶여진 결과물=객체
//객체: 식별가능한 모든것을 객체라한다. 객체지향 프로그램언어:프로그램을 만들때 관련있는것을 뭉쳐서 식별가능하게 프로그램으로 만듬
//클래스는 선언부와 생성부로 나눠져 있다.
//class Human{
//	public String name;
//	public int age;
//	public double height;
//	
//}
//class City{
//	 public String name;
//	 public int population;
//	 public int man;
//	 public int woman;
//	 public int Elderly;
//}
//
class car{
		public String name;
		public String price;
}
public class MyClass4 {

	public static void main(String[] args) {
	
//			double kor=0;
//			double eng=0;
//			double math=0;
//			double avg=0;
//			java.util.Scanner sc=new java.util.Scanner(System.in);		
//			System.out.println("국어성적입력");
//			kor=Double.parseDouble(sc.nextLine());		
//			System.out.println("영어성적입력");
//			eng=Double.parseDouble(sc.nextLine());		
//			System.out.println("수학성적입력");
//			math=Double.parseDouble(sc.nextLine());		
//			avg=(kor+eng+math)/3;
//			System.out.println("국어:"+kor+" 영어:"+eng+" 수학:"+math+" 평균:"+avg);
		
		
		
//			java.util.Scanner sc=new java.util.Scanner(System.in);					
//			double width=0;
//			double depth=0;
//			double height=0;
//			double result=0;
//			System.out.println("가로길이입력");
//			width=Double.parseDouble(sc.nextLine());		
//			System.out.println("세로길이입력");
//			depth=Double.parseDouble(sc.nextLine());		
//			System.out.println("높이입력");
//			height=Double.parseDouble(sc.nextLine());		
//			result=width*depth*height;
//			System.out.println(result);

			
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);					
//		double box=0;
//		double pencil=0;
//		double price=0;
//		double result=0;
//		System.out.println("몇 박스");
//		box=Double.parseDouble(sc.nextLine());		
//		System.out.println("추가 몇 자루");
//		pencil=Double.parseDouble(sc.nextLine());		
//		System.out.println("가격");
//		price=Double.parseDouble(sc.nextLine());		
//		result=(box*12+pencil)*price;
//		System.out.println(result);
//		
		
		//String.format() : 새로운 문자열을 만드는 메소드

//		String str=String.format(">%s %s %d %f", "이건", "뭐지", 558,51.6);
//		System.out.println(str);
//		System.out.println("첫번째문자열은:"+"시작");

		
		
//		String name="홍길동";
//		int age=20;
//		double height=120.2;
//		
//		System.out.println(String.format("이름:%s 나이:%d 키:%f",name,age,height));
		

		
		//문제1
		
//		int age=156;
//		String name="hong";
//		double height=175.3;
//		System.out.println(String.format("나이:%d 이름:%s 키:%d", age, name, height));
	
		
		
		
		//문제2
		
//		int one=0;
//		int two=0;
//		int result1=0;		int result2=0;
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("첫번째 정수");
//		one=Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 정수");
//		two=Integer.parseInt(sc.nextLine());
//		result1=one/two;
//		result2=one%two;
//		System.out.println(String.format("몫은 %d 이고, 나머지는 %d이다.", result1, result2));
		
			
		
	
		
		//문제3
		
//		int A=0;
//		int result100=0;
//		int result10=0;
//		int result1=0;
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("3자리 입력");
//		A=Integer.parseInt(sc.nextLine());
//		result100=A/100;
//		result10=A/10%10;
//		result1=A%10;				
//		System.out.println(String.format("백의자리:%d 십의자리:%d 일의자리:%d", result100, result10, result1));


		
		//문제4
		
//		double x1=0;
//		double y1=0;
//		double x2=0;
//		double y2=0;
//		double result=0;
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("x1 입력");
//		x1=Double.parseDouble(sc.nextLine());
//		System.out.println("y1 입력");
//		y1=Double.parseDouble(sc.nextLine());
//		System.out.println("x2 입력");
//		x2=Double.parseDouble(sc.nextLine());
//		System.out.println("y2 입력");
//		y2=Double.parseDouble(sc.nextLine());
//		result=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
//		System.out.println(String.format("거리:%f", result));
		
		
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		double width=0;
		double column=0;
		double height=0;
		double result=0;
		System.out.println("가로길이 입력");
		width=Double.parseDouble(sc.nextLine());
		System.out.println("세로길이 입력");
		column=Double.parseDouble(sc.nextLine());
		System.out.println("높이 입력");
		height=Double.parseDouble(sc.nextLine());
		result=width*column*height;
		System.out.println("부피:"+result);
		
		
		
		car c1=new car();
		c1.name="아반떼";
		c1.price="3000";
		System.out.println(c1.name+ c1.price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		City c=new City();
//		c.name="천안시";
//		c.population=672556;
//		c.man=344170;
//		c.woman=328386;
//		c.Elderly=67177;
//		
//		City c1=new City();
//		c1.name="아산시";
//		c1.population=333101;
//		c1.man=174414;
//		c1.woman=158687;
//		c1.Elderly=42355;
//		
//		City c2=new City();
//		c2.name="당진시";
//		c2.population=172943;
//		c2.man=92113;
//		c2.woman=80830;
//		c2.Elderly=29933;
//		
//		System.out.println(c.name+System.lineSeparator()+"인구:"+c.population+"명 "+"남성:"+c.man+" 여성:"+c.woman+" 고령자:"+c.Elderly);
//		System.out.println(c1.name+System.lineSeparator()+"인구:"+c1.population+"명 "+"남성:"+c1.man+" 여성:"+c1.woman+" 고령자:"+c1.Elderly);
//		System.out.println(c2.name+System.lineSeparator()+"인구:"+c2.population+"명 "+"남성:"+c2.man+" 여성:"+c2.woman+" 고령자:"+c2.Elderly);
						
		
//				
//		String name="천안시";
//		int population=672556;
//		int man=344170;
//		int woman=328386;
//		int Elderly=67177;
//
//		String name1="아산시";
//		int population1=333101;
//		int man1=174414;
//		int woman1=158687;
//		int Elderly1=42355;
//
//						
//		String name2="당진시";
//		int population2=172943;
//		int man2=92113;
//		int woman2=80830;
//		int Elderly2=29933;
//				
//		System.out.println(name+System.lineSeparator()+"인구:"+population+"명 "+"남성:"+man+" 여성:"+woman+" 고령자:"+Elderly);
//		System.out.println(name1+System.lineSeparator()+"인구:"+population1+"명 "+"남성:"+man1+" 여성:"+woman1+" 고령자:"+Elderly1);
//		System.out.println(name2+System.lineSeparator()+"인구:"+population2+"명 "+"남성:"+man2+" 여성:"+woman2+" 고령자:"+Elderly2);

		
		
//		Human h1=new Human();
//		h1.name="홍길동";
//		h1.age=25;
//		h1.height=178.4;
//		
//		Human h2=new Human();
//		h2.name="홍길서";
//		h2.age=22;
//		h2.height=180.4;
//		
//		Human h3=new Human();
//		h3.name="홍길북";
//		h3.age=58;
//		h3.height=155.6;
//		
				
		
//		System.out.println("이름:"+h2.name);
//		System.out.println("나이:"+h2.age);
//		System.out.println("키:"+h2.height);
//		
		
		//3인의 사람 데이터 만들기
//		String name1="홍길동";
//		int age1=24;
//		double height1=180.1;
//		
//		String name2="홍길북";
//		int age2=22;
//		double height2=178.1;
//		
//		String name3="홍길서";
//		int age3=25;
//		double height3=174.1;
	
		
		//class 관련있는 데이터를 묶어서 사용하기 위해서 사용함
		
		
		
		
		//현실세계의 데이터를 기본자료형 변수에 넣어서 출력해보고 클래스로 업그레이드 해보자
		//핸드폰, 자동차, 가방등
		
		

		

	
		
		
		
		
		
		
			
			
	}

}
