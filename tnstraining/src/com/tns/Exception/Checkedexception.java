package com.tns.Exception;
import java.io.FileReader;
public class Checkedexception {

				public void show() throws ArithmeticException{
				try {
					int a=7;
					int b=0;
					int c=a/b;
					System.out.println(c);
					}finally {
						System.out.println("This is finally block");

					}
			}

		}	
	

		
				
