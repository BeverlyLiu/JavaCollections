package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("selenium");
		ll.add("TestNG");
		ll.add("cucumber");
		ll.add("Maven");
		
		//print
		System.out.println("content of linkedlist: " + ll);
		
		//add first
		ll.addFirst("Automation");
		
		//add last
		ll.addLast("Jenkins");
		
		System.out.println("content of linkedlist: " + ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "black-box");
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist: " + ll);
		
		ll.remove(2);
		System.out.println("content of linkedlist: " + ll);
		
		/*
		 * print all the values of linkedList
		 * advance for loop
		 * iterator
		 * while loop
		 */
		
		System.out.println("- For Loop -");
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("- Advance For Loop -");
		for(String str: ll) {
			System.out.println(str);
		}
		
		System.out.println("- Iterator -");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("- While Loop -");
		int i=0;
		while(ll.size()>i) {
			System.out.println(ll.get(i));
			i++;
		}

	}

}
