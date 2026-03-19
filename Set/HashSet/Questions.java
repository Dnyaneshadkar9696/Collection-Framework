package setquestions;

import java.util.HashSet;
import java.util.Set;

public class Questions {

//	Create a HashSet and add 5 string values.

	public void call() {
		this.hashSetCreate();
		System.out.println();
		this.addDuplicateElement();
		System.out.println();
		this.display();
		System.out.println();
		this.checkElementExist();
		System.out.println();
		this.removeElement();
	}

	public void hashSetCreate() {

		HashSet sh = new HashSet();

		// we have to import the hashset class to use it

		sh.add("Ram");
		sh.add(3453);
		sh.add("Ganesh");
		sh.add(434.43f);
		sh.add(34535353595l);

		// to print the values we use the for each loop

		for (Object a : sh) {

			System.out.println(a);

		}

	}

//	Try to add duplicate elements in a Set and observe the output.

	public void addDuplicateElement() {

		Set se = new HashSet();

		System.out.println("We see if the duplicate element is present or not : ");
		se.add(34);
		se.add("Ramesh");
		se.add(44343443243l);
		se.add("Ganesh");
		se.add("Ramesh");

		for (Object o : se) {

			System.out.println(o);
			// as the result no duplcate elements are added

		}

	}

//	Display all elements of a Set using for-each loop.

	public void display() {

		Set sg = new HashSet();
		System.out.println("To display the elements in the Set: ");
		sg.add("Truck");
		sg.add("Car");
		sg.add("Bike");
		sg.add("Omni");
		sg.add("Bugatti");

		for (Object car : sg) {

			System.out.println(car);

		}

	}

//	Check whether a specific element exists in a Set.

	public void checkElementExist() {
		
		HashSet<String> sf = new HashSet<String>();

		sf.add("Truck");
		sf.add("Car");
		sf.add("Bike");
		sf.add("Omni");
		sf.add("Bugatti");
		
		   // Check element
        if (sf.contains("Car")) {
            System.out.println("Element exists");
        } else {
            System.out.println("Element does not exist");
        }

	}
	
//	Remove an element from a Set
	
	public  void  removeElement() {
		
		HashSet hf = new HashSet();
		System.out.println("Removing the value 43 from the set : ");
		hf.add(34);
		hf.add(43);
		hf.add(29);
		hf.add(79);
		hf.add(488);
		hf.add(438);
		
		System.out.println(hf.remove(43));
		
		for (Object ob: hf) {
			
			System.out.println(ob);
		}
	}
}
