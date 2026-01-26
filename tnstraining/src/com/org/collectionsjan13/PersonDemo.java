package com.org.collectionsjan13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PersonDemo {

	public static void main(String[] args) {
		List <person>ob = new ArrayList<person>();
		person p = new person("Durga", "hyd");
		ob.add(p);
		p = new person("bhavani", "delhi");
		ob.add(p);
		p = new person("Sree", "banglore");
		ob.add(p);
		p = new person("charan", "nalgonda");
		ob.add(p);
		System.out.println(ob);
		System.out.println("sorting names");
		Collections.sort(ob,new sortByName());
		System.out.println(ob);
		System.out.println("sorting city");
		Collections.sort(ob,new sortByCity());
		System.out.println(ob);


			}

		

	}

