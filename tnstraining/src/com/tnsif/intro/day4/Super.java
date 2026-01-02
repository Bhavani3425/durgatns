package com.tnsif.intro.day4;

public class Super {
	int a=20;
	Super(int b){
		System.out.println("contructor of parent");
	}
	public void show() {
		System.out.println("parent method");
	}
		
}
class samu  extends Super{
	samu(){
		super(45);
	}
	int a=50;
	public void display() {
		System.out.println(super.a);
		super.show();
		System.out.println("child class");
		
		
	}
	
}


