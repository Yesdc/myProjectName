package com.human.ex;

public class MyClass2 {

	public static void main(String[] args) {
		
		int a1=(int)10000000000l;
		int a2=(int)12.24;
		float a3=(float)23.5;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		//문제1
		boolean b=true;
		int i=1;
		short s=2;
		char c='a';
//		float f=1.234; 실수는 기본값이 double이기떄문에 double>float로 암시적변환이 안된다.
//		>>float f=(float)1.234;
//		short s2=s+c;  short+char=int이기떄문에 int>short로 암시적변환이 안된다.
//		>>short s2=(short)(s+c);
//		char c2=c+s    short+char=int이기떄문에 int>char로 암시적변환이 안된다.
//		>>char c2=(char)(c+s);
//		int i2=c+s;
//		int i3=b+i;    boolean자료형은 문자열자료형을 제외하고는 연산할 수 없다.
		
		
		
		//문제2 
//		1) 3+3+“hello”  6hello +연산자는 앞에서부터 계산되기떄문에 3+3부터 계산된다. 
//		2) 3*“hello”    문자열 연산은 +만가능하다
//		3)“hello”+4+4   hello44 문자+모든자료형의 결과는 문자열이다.
//		
		
		//문제3
//		int a= “10”;    int는 정수자료형이고 "10"은 문자열이다.
//		double d=(double) “123.3”; double은 실수자료형이고 "123.3"은 문자열이다
//		
		
		//문제4
		String name= "홍길동"; 
		int age=5;
		System.out.println("\"이름은 "+name+" 나이는 "+age+" 입니다.\"");
		
		//문제5
//		‘a’+1 String char+int =int int형에 저장된다
		
		
		//문제6
//		1)2.0+1.0/2.0    실수자료형
//		2)4.2/2+1 		 실수자료형
//		3)5+4/5			 정수자료형 
//		4)1+2/3d 		 실수자료형


		//문제7
//		불리언형= bloean(1)
//		정수형= byte(1), short(2), int,(4) long(8)
//		문자형= char(2)
//		실수형= float(4), double(8)
//		참조자료형=String

		
		//문제8 10 11 0xB 013 012
		
//		10 012
//		11 0xB 013
		
		
	}

}
