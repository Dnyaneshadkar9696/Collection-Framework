package sirquestions;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageAnalyzer {

//	Tasks:
//		Count total words
//		Find most used word
//		Filter messages containing specific keyword
//		Sort messages by length
//		Remove messages shorter than 3 words

	public void callingChat() {
		System.out.println();

		System.out.println("************Chat Message Analyzer************");

		this.countWords();
		
		System.out.println();
		this.mostUsedWord();
		
		System.out.println();
		this.filterMessages("honey");
		
		System.out.println();
		this.sortMessagesByLength();
		
		

	}

	// count total words

	public void countWords() {

		List<String> r = new ArrayList<String>();

		r.add("Hellow world my name is Dnyanesh. You know that octopuses have three hearts, the Eiffel Tower grows slightly taller in summer due to heat expansion, and honey never spoils even after thousands of years; you know sharks existed long before trees, bananas are technically berries while strawberries are not, and the human brain uses about 20% of the body’s energy; you also know that lightning is hotter than the Sun’s surface, wombats produce cube-shaped poop, and there are more stars in the universe than grains of sand on Earth.");

		int count = 0;

		System.out.println("To count the total words ");
		for (String s : r) {
			String[] words = s.split(" ");
			count += words.length;
		}

		System.out.println("Total words : " + count);

	}
	
//	Find most used word
	
	public void mostUsedWord() {
		
		List<String> r = new ArrayList<String>();

		r.add("Hellow world my name is Dnyanesh. You know that octopuses have three hearts, the Eiffel Tower grows slightly taller in summer due to heat expansion, and honey never spoils even after thousands of years; you know sharks existed long before trees, bananas are technically berries while strawberries are not, and the human brain uses about 20% of the body’s energy; you also know that lightning is hotter than the Sun’s surface, wombats produce cube-shaped poop, and there are more stars in the universe than grains of sand on Earth.");

		String mostUsed = null;
		int maxCount = 0;

		for (String s : r) {
			String[] words = s.split(" ");
			for (String word : words) {
				int count = 0;
				for (String w : words) {
					if (w.equals(word)) {
						count++;
					}
				}
				if (count > maxCount) {
					maxCount = count;
					mostUsed = word;
				}
			}
		}

		System.out.println("Most used word : " + mostUsed + " (used " + maxCount + " times)");
		
	}
	
	//	Filter messages containing specific keyword
	
	public void filterMessages(String keyword) {
		
		List<String> r = new ArrayList<String>();

		r.add("Hellow world my name is Dnyanesh. You know that octopuses have three hearts, the Eiffel Tower grows slightly taller in summer due to heat expansion, and honey never spoils even after thousands of years; you know sharks existed long before trees, bananas are technically berries while strawberries are not, and the human brain uses about 20% of the body’s energy; you also know that lightning is hotter than the Sun’s surface, wombats produce cube-shaped poop, and there are more stars in the universe than grains of sand on Earth.");

		System.out.println("Messages containing the keyword '" + keyword + "':");
		for (String s : r) {
			if (s.contains(keyword)) {
				System.out.println(s);
			}
		}
		
	}
	
	//	Sort messages by length
	
	public void sortMessagesByLength() {
		
		List<String> r = new ArrayList<String>();

		r.add("Hellow world my name is Dnyanesh. You know that octopuses have three hearts, the Eiffel Tower grows slightly taller in summer due to heat expansion, and honey never spoils even after thousands of years; you know sharks existed long before trees, bananas are technically berries while strawberries are not, and the human brain uses about 20% of the body’s energy; you also know that lightning is hotter than the Sun’s surface, wombats produce cube-shaped poop, and there are more stars in the universe than grains of sand on Earth.");

		r.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println("Messages sorted by length:");
		for (String s : r) {
			System.out.println(s);
		}
		
	}

}
