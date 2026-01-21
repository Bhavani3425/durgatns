package com.org.collectionsjan2;
import java.util.ArrayList;
import java.util.Collections;
public class Studentcollect {


		

			public static void main(String[] args) {
				ArrayList<Student> ob = new ArrayList<Student>();
				Student st = new Student(101, "Durga", 100.0);
				ob.add(st);
				st = new Student(102, "bhavani", 57.0);
				ob.add(st);
				st = new Student(103, "gita", 90.0);
				ob.add(st);
				st = new Student(104, "jaju", 89.0);
				ob.add(st);
				System.out.println("before sorting");
				System.out.println(ob);
				System.out.println("after sorting");
				Collections.sort(ob);
				System.out.println(ob);
				

			}

		

	}


