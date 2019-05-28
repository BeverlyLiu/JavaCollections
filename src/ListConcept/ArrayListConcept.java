package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; //static array -- size is fixed
		
		/*dynamic array -- ArrayList
		 * can contain duplicate values/elements
		 * maintains insertion order
		 * synchronized
		 * allows random access to fetch the element because it stores the values on the basic of indexes
		 */
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(100);
		al.add(12.33);
		al.add("Tom");
		al.add(true);
		al.add("c");
		
		//print the all values from array list using iterator
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//non generic vs. generic
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		//al1.add("Selenium"); //incorrect data type
		
		ArrayList<String> al2 = new ArrayList<String>();
		//al1.add(100); //incorrect data type
		al.add("Selenium");
		
		ArrayList<E> al3 = new ArrayList<E>(); //usually we don't use

		//Employee class objects
		Employee e1 = new Employee("Bev", 25, "QA");
		Employee e2 = new Employee("Becky", 26, "Dev");
		Employee e3 = new Employee("Tom", 27, "DevOps");
		
		//create arrayList
		ArrayList<Employee> al4 = new ArrayList<Employee>();
		al4.add(e1);
		al4.add(e2);
		al4.add(e3);
		
		//iterator to traverse the values
		System.out.println("----------");
		Iterator<Employee> it = al4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//addAll()
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("Test");
		al5.add("Selenium");
		al5.add("TestNG");
		
		ArrayList<String> al6 = new ArrayList<String>();
		al6.add("Dev");
		al6.add("Java");
		al6.add("Python");
		
		al5.addAll(al6);
		
		System.out.println("----------");
		for(int i=0; i<al5.size(); i++) {
			System.out.println(al5.get(i));
		}
		
		//removeAll()
		al5.removeAll(al6);
		System.out.println("----------");
		for(int i=0; i<al5.size(); i++) {
			System.out.println(al5.get(i));
		}
		
		//retainAll()
		ArrayList<String> al7 = new ArrayList<String>();
		al7.add("Test");
		al7.add("Selenium");
		al7.add("TestNG");
		
		ArrayList<String> al8 = new ArrayList<String>();
		al8.add("Test");
		al8.add("Java");
		al8.add("Python");
		
		al7.retainAll(al8);
		System.out.println("----------");
		for(int i=0; i<al7.size(); i++) {
			System.out.println(al7.get(i));
		}

	}
	
}
