package com.human.ex1;

import java.util.Scanner;

//문제 1)텔레비전을 켜고 끌 수 있고, 채널을 변경할수 있고, 볼륨을 조절할수 있는 형태로
//TV클래스를 만들어 보고 운영해 보자.
class TVon{
	public int channel=0;
	public int volume=0;
	
	public void volumUp(){
		volume++;
		System.out.println("볼륨 1증가");
	}
	public void volumDown() {
		volume--;
		System.out.println("볼륨 1감소");
	}
	public void channelSelect(int i) {
		channel=i;
		System.out.println("현재채널="+channel);

	}
	public void channelUp() {
		channel++;
		System.out.println("현재채널="+channel);
	}
	public void channelDown() {
		channel--;
		System.out.println("현재채널="+channel);
	}
	public void tvOff() {
		Scanner sc=new java.util.Scanner(System.in);
		System.out.println("off"+"다시키려면 on을 입력하세요");
		String onOff=sc.next();
		if(onOff.equals("on")) {
			channelUp();
		}
		
	}
}	





public class JavaClass13 {

	public static void main(String[] args) {
		TVon tv1=new TVon();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.tvOff();
		
	}

	

}
