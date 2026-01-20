package com.tnsif.string;

public class Strings {
	

	

		public static void main(String[] args) {
			String s=new String("Hello");
			String s1=new String("Hi");
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s.toLowerCase());
			System.out.println(s.toUpperCase());
			System.out.println(s.length());
			System.out.println(s.charAt(3));
			System.out.println(s.indexOf('e'));
			System.out.println(s);
			System.out.println(s.equals(s1));
			System.out.println(s==s1);
			StringBuffer sb=new StringBuffer("so sweet");
			StringBuilder sb1=new StringBuilder("myself");
			System.out.println(sb);
			System.out.println(sb1);
			//System.out.println(sb.toLowerCase());
			//System.out.println(sb.toUpperCase());
			System.out.println(sb.length());
			System.out.println(sb.charAt(3));
			//System.out.println(sb.indexOf('e'));
			System.out.println(sb);
			System.out.println(sb.equals(sb1));
			//System.out.println(sb==sb1);
		}
	}


