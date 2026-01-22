package com.org.multithreading;

public class Multithread extends Thread  {

	
		

		
			public void run() {
				try {
					System.out.println("This is current thread"+Thread.currentThread().getId());
				}catch(Exception e) {
					System.out.println("Exception cought");
				}
			}

		

	}


