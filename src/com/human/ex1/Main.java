package com.human.ex1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n+1;i++) {			
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		
		}
		
		
		
		
	}

}
