package com.human.ex;

public class MyClass {

	public static void main(String[] args) {
	System.out.println("hello"+System.lineSeparator()+"world");
		
		
		int a=5;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a--);
		System.out.println(a);
		
		//조건식? true식:  false식: 
		//조건식이 true면 true식만 남는다. 조건식이false면 false식만 남는다.
		int b=5;
		b=(true)?6:7;
		System.out.println(b);
	
		
		b=(false)?1:2;
		System.out.println(b);
	

		b=(9<b)?6:7;
		System.out.println(b);
	
		b=(b==6)?b+1:b-2;
		System.out.println(b);
					
		
		int q=5;
		int w=6;
		int sum=q+w;
		q=7;
		
		System.out.println("sum="+sum); 	//11
		System.out.println("q="+q);   		//7
		System.out.println("w="+w);			//6
		System.out.println("");	
		sum=q+w;
		
		System.out.println("sum="+sum); 	//13
		System.out.println("q="+q);			//7
		System.out.println("w="+w);			//6
		System.out.println("");	
		
		//문제1 (5+3)*6
		
		int i=5+3;
		int o=8*6;
		System.out.println(i);
		System.out.println("(5+3)*6="+o);	
		System.out.println("");	
		
		
		//문제2
		int sum1=8%5;
		int sum2=3*1;
		int sum3=5*5;
		int sum4=3+25;
	
		System.out.println(sum1);	
		System.out.println(sum2);	
		System.out.println(sum3);	
		System.out.println(sum4);	
		System.out.println("3+5*5+(8%5*1="+sum2+sum4);	
		System.out.println("");	
		
		
		//문제3 5%6+(3+3*2)
		int s=3*2;
		int d=3+6;
		int f=5%6;
		
		System.out.println(s);	
		System.out.println(d);	
		System.out.println(f);	
		System.out.println("5%6+(3+3*2)="+d+f);	
		System.out.println("");	
			
		//문제4 2%6+3+(2+5)+3/2 
		int z=2+5;
		double x=3/2;
		int c=2%6;
		System.out.println("2%6+3+(2+5)+3/2="+c+3+z+x);	
		
		//문제5 a=b=40; a=5+3=8*4;
		//a=b=40;식은 상수를 두개의 변수에 한번에 변경할 수 없다.
		//a=5+3=8*4;식에서 5+3은 8, 8*4는 32이므로
		//8이라는 상수를 32라는 상수로 변경할 수 없다.


	}

}
