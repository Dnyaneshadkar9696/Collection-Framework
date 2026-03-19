package collectionframework;

import java.util.ArrayList;

public class Questions {
	
	public void call() {
		this.arrayQuesion();
		System.out.println();
		this.display();
		System.out.println();
		this.addSpecificIndex();
		
		
		System.out.println();
		this.removeElement();
		System.out.println();
		this.findSize();
		System.out.println();
		this.checkEmpty();
		
		System.out.println();
		this.retriveElement();
	}
	
	// Create an ArrayList and add 5 integers to it
	
	public void arrayQuesion() {
		
		ArrayList arr = new ArrayList();
		
		// we not mention the generics as we want the mixed type of the data
		System.out.println("Printig ArrayList Elements : ");
		arr.add(22);
		arr.add(28);
		arr.add(78);
		arr.add(68);
		arr.add(98);
		
		// we use for each loop to iterate and print the values
		
		for (Object i : arr) {
			System.out.println(i);
			
		}
	}
	
	//Write a program to display all elements of a List using for-each loop.
	
	public void display() {
		
		System.out.println("Using for each loop to print the elements : ");
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Sham");
		list.add("Gansham");
		list.add("Murli");
		list.add("Radha");
		list.add("Vivek");
		list.add("Niraj");
		
		for(String r: list) {
			System.out.println(r);
		}
	}
	
	//Add an element at a specific index in an ArrayList.
	
	public void addSpecificIndex() {
		
		ArrayList ar = new ArrayList();
		
		System.out.println("Adding an element at the index 5: ");
		ar.add(34);
		ar.add("Ramesh");
		ar.add(345.45f);
		ar.add(345345345l);
		ar.add("Ganesh");
		
		// adding an element in array list at particular index
		
		ar.add(5, "Shreeyash");

		
		for(Object g : ar) {
			System.out.println(g);
		}
	}
	
//	Remove an element from a List using index.
	
	public void removeElement() {
		ArrayList sds = new ArrayList();
		System.out.println("Array List after removing element in array List : ");
		sds.add("Ramesh");
		sds.add(234);
		sds.add(3433.44f);
		sds.add("Viraj");
		sds.add("Dnyanehs");
		
		sds.remove(1);
		for(Object s : sds) {
			System.out.println(s);
		}
		
	}
	
	// Find the size of a List.
	
	public void findSize() {
		ArrayList srl = new ArrayList();
		
		srl.add(123);
		srl.add(343);
		srl.add(63);
		srl.add(83);
		srl.add(393);
		srl.add(243);
		srl.add(3763);
		System.out.println("Size of an ArrayList : ");
		System.out.println(srl.size());
	}
	
	
	// Check whether a List is empty or not.
	
	public void checkEmpty() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(453);
		ar.add(754);
		ar.add(87);
		ar.add(978);
		ar.add(34);
		System.out.println("The List is empty : ");
		System.out.println(ar.isEmpty());
	}
	
//	Retrieve an element from a List using get() method.
	
	public void retriveElement() {
		ArrayList sf = new ArrayList();
		
		System.out.println("Retriving the elements using the get method - ");
		sf.add("Shreeram");
		sf.add("Ganesh");
		sf.add("Vikranth");
		sf.add("Pune");
		System.out.println("First Element : ");
		System.out.println(sf.getFirst());
		System.out.println("Last Element : ");
		System.out.println(sf.getLast());
		System.out.println("Element using the index : ");
		System.out.println(sf.get(2));
	}

}
