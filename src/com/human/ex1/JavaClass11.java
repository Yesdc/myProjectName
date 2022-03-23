package com.human.ex1;

import java.util.Arrays;

public class JavaClass11 {

	public static void main(String[] args) {
		
//		int arr[]= {6,5,1,8,7,4,2,3};
//		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//					System.out.println(Arrays.toString(arr));
//				}
//			}
//		}
//		System.out.print(Arrays.toString(arr));
//		
//		
		
		int arr[]= {6,5,1,8,7,4,2,3};
	
		System.out.println(Arrays.toString(arr));
		for(int i=7;i>0;i--) {
			int maxIndex=0;		
			int selectIndex=i;
			for(int j=0;j<=selectIndex;j++) {
				if(arr[j] > arr[maxIndex]) {
					
					maxIndex=j;
				}
			}
			
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[selectIndex];
			arr[selectIndex]=temp;
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
