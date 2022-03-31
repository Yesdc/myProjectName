package com.human.ex1;


//
//	문제1 1. 삼각형, 원 클래스를 만들어 넓이 둘레를 구하는 프로그램을 만들어보자.

class Triangle{
	public double botton=0;
	public double height=0;
	public double sideLength1=0;
	public double sideLength2=0;
	public double sideLength3=0;
	
	public void area() {
		System.out.println("넓이="+(botton*height)/2);
	}
	public void periphery() {
		System.out.println("둘레="+(sideLength1+sideLength2+sideLength3));
	}
	
	
	
}
class Circle{
	public double radius=0;
	
	public void area() {
		System.out.println("넓이="+Math.PI*(radius*radius));
	}
	public void periphery() {
		System.out.println("둘레="+2*Math.PI*radius);
	}
}

//	문제2  국,영,수과목 점수를 저장하고 총점과 평균을 출력하는 Student 클래스를 만들어 사용해
//보자.

class Student{
	public double Kor=0;
	public double Eng=0;
	public double Math=0;
	
	public void Kor() {
		System.out.print(Kor+" ");
	}public void Eng() {
		System.out.print(Eng+" ");
	}public void Math() {
		System.out.println(Math+" ");
	}

	public void totalScore() {
		System.out.println("총점= "+(Kor+Eng+Math)+"점");
	}
	public void Average() {
		System.out.println("평균= "+(Kor+Eng+Math)/3+"점");
	}
	
}

//	문제3  다음 이미지 클래스 처럼 동작하는 Car과 CellPhone 클래스를 만들어 보자.

class Car{
	public int speed=0;
	public String model="";
	
	public void speedUp() {
		speed=speed+10;
	}
	public void speedDown() {
		speed=speed-10;
	}
	public void statement() {
		System.out.println("현재 차종:"+model+" 속력은 "+speed+"입니다.");
	}
	
}
class CellPhone{
	public String name="";
	public String phoneNumber="";
	public String sendName="";
	public String sendPhoneNumber="";
	
	public String msg="";
	
	public CellPhone(String name, String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;		
	}
	public void sendInput(String sendName, String sendPhoneNumber, String msg) {
		this.sendName=sendName;
		this.sendPhoneNumber=sendPhoneNumber;
		this.msg=msg;
	}
	public void sendMsgButton() {
		System.out.println(this.msg);
	}
	public void sendInput(String sendName, String sendPhoneNumber) {
		this.sendName=sendName;
		this.sendPhoneNumber=sendPhoneNumber;
		
	}
	public void sendButton() {
		System.out.println(this.name+"("+this.phoneNumber+")"+"님이 "+sendName+"("+
				 sendPhoneNumber+")"+" 님에게 전화를 겁니다");
	}
	
}




public class JavaClass12 {
	
	public static void main(String[] args) {
		
//		Triangle t1=new Triangle();
//		t1.botton=5; t1.height=6;
//		t1.sideLength1=5;
//		t1.sideLength2=4;
//		t1.sideLength3=7;
//		t1.area();
//		t1.periphery();

//		Circle c1=new Circle();
//		c1.radius=3;
//		c1.area();
//		c1.periphery();
		
//		Student s1=new Student();
//		s1.Eng=80; s1.Kor=70; s1.Math=94;
//		
//		Student s2=new Student();
//		s2.Eng=90; s2.Kor=30; s2.Math=94;
//		
//		s1.Kor();
//		s1.Eng();
//		s1.Math();
//		s1.Average();
//		s2.Kor();
//		s2.Eng();
//		s2.Math();
//		s2.Average();
		
//		Car c1=new Car();
//		c1.model="그랜저";
//		c1.speedUp();
//		c1.statement();
//		c1.speedUp();
//		c1.speedUp();
//		c1.speedUp();
//		c1.statement();
		
//		CellPhone phone=new CellPhone("홍길동","010-1111-1111");
//		phone.sendInput("홍길남", "010-2222-2222", "안녕");
//		phone.sendMsgButton();
//		phone.sendInput("홍길남","010-2222-2222");
//		phone.sendButton();
	}

}
