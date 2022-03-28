package com.human.ex1;

import java.util.Arrays;
import java.util.Scanner;
public class BlackJack {

	public static void main(String[] args) {
	
		String [] cardShape= {"하트","다이아","스페이드","클로버"};
		String [] cardNumber= {"A","2","3","4","5","6","7","8","9","10","j","q","K"};
		int deck[]=new int[52];
		
		
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		for(int i=0;i<10000000;i++) {
			int Shake=(int)(Math.random()*52);				
			int temp1=deck[0];
			deck[0]=deck[Shake];
			deck[Shake]=temp1;
		}	
		
		
		int deckIndex=0;//덱에서 카드사용유무 구분인덱스
		int p1Deck[]=new int[11];//플레이어의 카드묶음
		int p2Deck[]=new int[11];	
		int p1DeckIndex=0;//플레이어의 카드개수				
		int p2DeckIndex=0;				
		
		
		boolean isP1=true;
		boolean isP2=true;

		
		Scanner sc=new Scanner(System.in);
		for(;(isP1||isP2)&&(p1DeckIndex!=p1Deck.length)&&(p2DeckIndex!=p2Deck.length);) {
			for(;isP1||isP2;) {
				if(isP1) {
					System.out.print("p1님 카드를 받으시겠습니까? 1.yse 2.no");
					String p1=sc.next();
					if(p1.equals("1")) {
						p1Deck[p1DeckIndex++]=deck[deckIndex++];
						
					}else {
						isP1=false;
					}
				}
				if(isP2) {
					System.out.print("p2님 카드를 받으시겠습니까? 1.yse 2.no");
					String p2=sc.next();
					if(p2.equals("1")) {
						p2Deck[p2DeckIndex++]=deck[deckIndex++];
						
					}else {
						isP2=false;
					}
				}
				System.out.println("p1 card");				
				
				int sum1=0;
				int sum2=0;
				for(int i=0;i<p1DeckIndex;i++) {			
					System.out.println(cardShape[p1Deck[i]/13]+cardNumber[p1Deck[i]%13]);
					if(p1Deck[i]%13==0) {
						sum1=sum1+11;
					}else if(p1Deck[i]%13<10) {
						sum1=sum1+p1Deck[i]%13+1;
					}else {
						sum1=sum1+10;
					}
					
				}
			
				for(int i=0;i<p1DeckIndex;i++) {
						if(sum1>21&&p1Deck[i]%13==0) {	
							sum1=sum1-10;
						}	
				}
						
					
				
				System.out.println("총점="+sum1);
				System.out.println("p2 card");		
				
				for(int i=0;i<p2DeckIndex;i++) {			
					System.out.println(cardShape[p2Deck[i]/13]+cardNumber[p2Deck[i]%13]);
					
					if(p2Deck[i]%13==0) {
						sum2=sum2+11;
					}else if(p2Deck[i]%13<10) {
						sum2=sum2+p2Deck[i]%13+1;
					}else {
						sum2=sum2+10;
					}
					
				}
				for(int i=0;i<p2DeckIndex;i++) {
					if(sum2>21&&p2Deck[i]%13==0) {	
						sum2=sum2-10;
					}	
			}
				System.out.println("총점="+sum2);
				
			}
		
		}
		
	

			
				
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
