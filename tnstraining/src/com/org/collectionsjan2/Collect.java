package com.org.collectionsjan2;
import java.util.ArrayList;
import java.util.LinkedList;
public class Collect {

	public static void main(String[] args) {
		
		
				ArrayList al=new ArrayList();
				al.add(143);
				al.add("byee");
				al.add(342.5f);
				al.add('D');
				System.out.println(al);
				al.remove(3);
				System.out.println(al);
				
				
				
				LinkedList li=new LinkedList();
				li.addFirst(158);
				li.addFirst("TNS");
				li.addFirst(0.23f);
				li.addLast('B');
				li.addLast(139);

				System.out.println(li);
				li.removeFirst();
				System.out.println(li);
				

			}

		

	}


