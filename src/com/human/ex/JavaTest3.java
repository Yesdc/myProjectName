package com.human.ex;

public class JavaTest3 {

	public static void main(String[] args) {
		
		System.out.println(true);
		System.out.println(false);
		
		System.out.println('임');
		System.out.println('\u0041');
		
		
		
		System.out.println(10000000000L);
		
		
		System.out.println(3.14);
		System.out.println(3.14f);
		System.out.println(3.14d);
		System.out.println(3f);
		System.out.println(3.f);
		
		
		
		float a=1.2F;
		

		System.out.println(Math.PI);
		
		
		
		System.out.println(a+1.6);
		
		
		
		
		
		
		byte a1=10; 
		byte a2=11;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1+a2);
		System.out.println(a1+1);
		
		
		short b1=10;
		short b2=11;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1+b2);
		System.out.println(b1+1);
		
		
		long  c1=10L;
		short c2=11;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1+c2);
		System.out.println(c1+1);
	
		
		
		String  name="홍길동"; 
		int     age=29;
		int 	height=170;
		System.out.println("이름="+name+ System.lineSeparator()+
						   "나이="+age+System.lineSeparator()+
						   "키"+height);
	
		
	   StringBuilder str=new StringBuilder("홍길동의 주머니");
	   str.insert(5, "돈"); 
       System.out.println(str);
       
	   
	}

}
