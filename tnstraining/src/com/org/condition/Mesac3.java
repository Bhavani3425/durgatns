package com.org.condition;
import java.util.Scanner;
public class Mesac3 {

	public static void main(String[] args) {
		

		
				Scanner sac=new Scanner(System.in);
				System.out.println("Enter number:" );
		        int a=sac.nextInt();
		        switch(a) {
				case 1:
					System.out.println("Best");
					break;
				case 2:
					System.out.println("Better");
					break;
				case 3:
					System.out.println("Good");
					break;
				case 4:
					System.out.println("Nice");
					break;
				default:
					System.out.println("Worst");
					break;
			}

		}
		

	}


