package com.tnsif.inheritance;

public class Multii {

	
		public void show() {
			System.out.println("parent");
			
		}
	}
		class B extends Multii{
			public void display() {
			System.out.println("Child");
		}
		}
		class C extends B{
			public void miss() {
				System.out.println("Subclass");
			}
		

	}


