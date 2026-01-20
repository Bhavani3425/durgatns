package com.tns.array;

public class Singlearray {

	public static void main(String[] args) {
		

		

			
				int[] arr= {1,2,3,4,5};
				System.out.println(arr[2]);
				//System.out.println(arr[6]); // raises ArrayIndexOutOfBound Exception

				int[] num=new int[3];
				num[0]=45;
				num[1]=5;
				num[2]=57;
				for(int i=0;i<3;i++) {
					System.out.println(num[i]);	
				}
		}
		

	}


