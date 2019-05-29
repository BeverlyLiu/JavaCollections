package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {
	
	public static void main(String[] args) {
		
		/*HashMap is a class implements map Interface
		 * extends Abstract Map
		 * contains only unique elements
		 * stores the values - key - value pair
		 * it may have one null key and multiple null values
		 * it maintains no order
		 * HashMap is non synchronized -- not thread safe
		 * concurrent modification exception -- Fail - Fast condition
		 * good for performance
		 */
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Seleninm");
		hm.put(2, "TestNG");
		hm.put(3, "Maven");
		hm.put(4, "Jenkins");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("----------");
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Bev", 35, "QA");
		Employee e2 = new Employee("Becky", 36, "Dev");
		Employee e3 = new Employee("Helen", 37, "DevOps");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//Iterator: traverse the hashMap
		System.out.println("----------");
		for(Entry<Integer,Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.print("Employee " + key + " Info: ");
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}
	}
}
