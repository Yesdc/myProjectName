package com.human.dto;

public class Tree {
		public String name;
		public int hour;
		public int exp;
		public int price;
		public int max;
		public int now;
		public Owner owner=new Owner();
		
		public Tree() {}
		public Tree(String name, int hour, int exp, int price, int max, int now, 
				    String Oname, int Oage, String Otel) {
			
		this.name=name;
		this.hour=hour;
		this.exp=exp;
		this.price=price;
		this.max=max;
		this.now=now;
	    this.owner.name=Oname;
	    this.owner.age=Oage;
	    this.owner.tel=Otel;
	    
		
		
			
			
			
			
			
		}
}
