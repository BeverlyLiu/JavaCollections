package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		/*it is similar to HashMap, but its synchronized
		 * stores the value on the basic of key and values
		 * key -- object -- HashCode -- value
		 * No duplicate members, unordered and unindexed
		 */
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Automation");
		
		//create a clone copy/shallow copy
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone();
		
		System.out.println("The values from h1: " + h1);
		System.out.println("The values from h2: " + h2);
		
		h1.clear();
		System.out.println("----------");
		System.out.println("The values from h1: " + h1);
		System.out.println("The values from h2: " + h2);
		
		//contains value
		
		Hashtable st = new Hashtable();
		
		st.put("A", "Selenium");
		st.put("B", "TestNG");
		st.put("C", "Maven");
		st.put("D", "Cucumber"); //no null key and null value
		
		System.out.println("----------");
		if(st.contains("Selenium"))
			System.out.println("Value is found");
		
		//print all the value from Hashtable using Enumeration element()
		Enumeration e = st.elements();
		
		System.out.println("----------");
		System.out.println("Print values from st using enumeration: ");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using entrySet() -- set of hashtable values
		
		System.out.println("----------");
		System.out.println("Print values from st using entrySet: ");
		
		System.out.println("----------");
		Set s = st.entrySet();
		System.out.println(s);
		
		Hashtable st1 = new Hashtable();
		
		st1.put("A", "Selenium");
		st1.put("B", "TestNG");
		st1.put("C", "Maven");
		st1.put("D", "Cucumber");
		st1.put("D", "Cucumber");
		
		System.out.println("----------");
		System.out.println("No duplicate members, unordered and unindexed in hash table");
		System.out.println(st1);
		
		//compare with st and st1
		System.out.println("----------");
		if(st.equals(st1))
			System.out.println("Both are the same");
		
		//get value
		System.out.println("----------");
		System.out.println(st1.get("A"));
		
		//get the hashCode of Hashtable object
		
		System.out.println("----------");
		System.out.println("st1 hash code value: " + st1.hashCode());
		

	}

}
