package com.tns.array;

public class Jaggeredarray {

	public static void main(String[] args) {
		
		
				int[][] jagged=new int[5][7];
				jagged[0]=new int[5]; //1st row 5 columns
				jagged[1]=new int[9];
				jagged[2]=new int[4];
				jagged[3]=new int[3];

				for(int i=0;i<jagged.length;i++) {
					for(int j=0;j<jagged[i].length;j++) {
						jagged[i][j]=(int)(Math.random()*100);
						System.out.print(jagged[i][j]+" ");	
					}
					System.out.println();	
			}
			
			}

		
	}


