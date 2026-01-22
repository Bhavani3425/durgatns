package com.org.condition;
import java.util.Scanner;
public class Me2sac {

	public static void main(String[] args) {
		{

				Scanner sac=new Scanner(System.in);
				System.out.println("Enter number:" );
		        int marks=sac.nextInt();


				if (marks >= 90) {
				    System.out.println("Grade A");
				} else if (marks >= 75) {
				    System.out.println("Grade B");
				} else if (marks >= 60) {
				    System.out.println("Grade C");
				} else {
				    System.out.println("Fail");
				}
			}

		}


	}


