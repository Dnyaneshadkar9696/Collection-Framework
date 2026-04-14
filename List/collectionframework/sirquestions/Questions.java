package sirquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Questions {

	// we have list of students in the arraylist and we have to perform the
	// operations on them
	public void calling() {

		this.arrayInstitute();

		System.out.println();

		this.sortArraylist();

		System.out.println();

		this.startigwithVowel();

		System.out.println();

		this.coutnFrequency();

		System.out.println();

		this.longestName();
		
		System.out.println();
		
		this.touppercaseArray();
	}

	public void arrayInstitute() {

		ArrayList<String> rt = new ArrayList<String>();

		rt.add("Ramesh");
		rt.add("Suraj");
		rt.add("Vinod");
		rt.add("Komal");
		rt.add("Naha");
		rt.add("Shakshi");
		rt.add("Suraj");
		rt.add("Naha");

//		now the operations

		// remove duplicate names

		ArrayList<String> r = new ArrayList<String>();

		// do using the Iterater method

		Iterator<String> uu = rt.iterator();

		// we got the curdor
		while (uu.hasNext()) {

			Object f = uu.next();

			if (!r.contains(f)) {
				r.add((String) f);
			}
		}

		System.out.println("The string without the repetation of the word :");
		System.out.println(r);

		// so we did using the iteration

	}

	// next Question 2

//	we have to sort the names alphabetically using the build in Collection.sort method

	public void sortArraylist() {
		ArrayList<String> ui = new ArrayList<String>();

		ui.add("Ganesh");
		ui.add("Suraj");
		ui.add("Vidya");
		ui.add("Nirmala");
		ui.add("Rakesh");
		ui.add("Yuraj");
		ui.add("Aditya");

		Collections.sort(ui);

		System.out.println("List after sorting: ");
		System.out.println(ui);
	}

	// next question

//	to find the names starting with the vowels 

	public void startigwithVowel() {

		ArrayList<String> tyd = new ArrayList<String>();

		tyd.add("Vidya");
		tyd.add("Jasmin");
		tyd.add("Vivek");
		tyd.add("Anisha");
		tyd.add("Rohit");
		tyd.add("Yuraj");
		tyd.add("Uday");

		// we will use the iterator

		Iterator<String> yu = tyd.iterator();
		System.out.println("The string with the vowel starting : ");

		while (yu.hasNext()) {
			String name = yu.next();
			char fchar = Character.toLowerCase(name.charAt(0));
			// got the first letter of each name
			if (fchar == 'a' || fchar == 'e' || fchar == 'i' || fchar == 'o' || fchar == 'u') {

				System.out.println(name);
			}
		}

	}

	// question 3
	// to count the frequency of each name

	public void coutnFrequency() {

		ArrayList<String> oi = new ArrayList<String>();

		oi.add("Harshad");
		oi.add("Vinod");
		oi.add("Ganesh");
		oi.add("Niraj");
		oi.add("Manisha");
		oi.add("Rupali");

		Iterator<String> hh = oi.iterator();

		while (hh.hasNext()) {
			String g = hh.next();
			int count = 0;
			for (int i = 0; i < g.length(); i++) {
				count++;
			}

			System.out.println("The frequency of word " + g + " is : " + count);
		}
	}

	// question 4
	// To find the longest name

	public void longestName() {

		ArrayList<String> ir = new ArrayList<String>();

		ir.add("Harshad");
		ir.add("Vinod");
		ir.add("Ganesh");
		ir.add("Niraj");
		ir.add("Manisha");
		ir.add("Rupalikumari");

		// see each string count or the each name count
//		System.out.println("The longest name is : ");
		Iterator<String> hi = ir.iterator();
		int highleng = 0;
		String longest = "";

		while (hi.hasNext()) {

			// we can directly get the length

			String gd = hi.next();

			int length = gd.length();

			if (length > highleng) {
				highleng = length;
				longest = gd;

			}

		}
		System.out.println("The longest string is : "+ longest);

	}
	
	
	// Question 5th
	
	public void touppercaseArray() {
		
		ArrayList<String> id = new ArrayList<String>();
		
		id.add("Suraj");
		id.add("Ramesh");
		id.add("Nirmla");
		id.add("Rutuja");
		
		Iterator<String> bd = id.iterator();
		System.out.println("To print string in uppercase.");
		while(bd.hasNext()) {
			
			String g = bd.next();
			
			
			System.out.println(g.toUpperCase());
		}
		
		
		
	}
	
		

}
