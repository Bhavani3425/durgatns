package com.tns.array;

public class MultipleArray {

	public static void main(String[] args) {
		
				//int[][] arr= {{1,2},{3,5}};  
				int[][] nums=new int[4][5];
				//nums[0][0]=1;
				//nums[0][1]=12;
				//nums[0][2]=123;
				//nums[0][3]=12345;
				//nums[0][4]=134;
				
				for(int i=0;i<4;i++) {
					for(int j=0;j<5;j++) {
						nums[i][j]=(int)(Math.random()*100);
						System.out.print(nums[i][j]+" ");	
					}
					System.out.println();	
			}
			

		}

		

	}


