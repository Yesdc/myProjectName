package com.human.dto;

public class Car {
		public String color;
		public String company;
		public int maxSpeed;
		public String model;
		public Tire tire=new Tire();
		
		public Car() {}
		public Car(String color, String company, int maxSpeed, String model,
				   String tcompany, double tprice, double milege) {
			
			
			this.color=color;
			this.company=company;
			this.maxSpeed=maxSpeed;
			this.model=model;
			this.tire.company=tcompany;
			this.tire.price=tprice;
			this.tire.mileage=milege;
					
					
		
			
		}
		
		
	
	
	
	
	
}
