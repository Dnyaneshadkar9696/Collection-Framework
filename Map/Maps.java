package collectionframework;

import java.util.HashMap;
import java.util.Map.Entry;

public class Maps {
	

	
	public void callMap() {
		// this method is used to call the other methods
		
		this.HasdData();
		System.out.println();
		this.retriveValue();
		
		System.out.println();
		this.checkKeyExist();
		
		System.out.println();
		this.checkValue();
		
		System.out.println();
		this.toremoveEntry();
		
		System.out.println();
		this.findSize();
	}
	
//	Create a HashMap and store Roll No as key and Name as value.
	
	public void HasdData() {
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(1 , " Ganesh");
		h.put(2 , " Ramesh");
		h.put(3 , " Vinod");
		h.put(4 , " Suraj");
		h.put(5 , " Gansham");
		
		for (Entry<Integer, String> sd : h.entrySet()) {
			
			System.out.println(sd);
			
		}
		
	}
	
//	 Retrieve a value using a key from Map.
	
	public void retriveValue() {
		
		HashMap<Integer, Object> mp = new HashMap<Integer, Object>();
		
		mp.put(1, "Ram");
		mp.put(2, 23.4f);
		mp.put(3, "Ganesh");
		mp.put(4, 43);
		mp.put(5, "Major");
		
		System.out.print("Retriving the value using the key : ");
		System.out.print(mp.get(3));
		
	}
	
//	 Check whether a key exists in Map.
	
	public void checkKeyExist() {
		
		HashMap shd = new HashMap();
		
		shd.put(1, "Ram");
		shd.put(2, 3434343434343l);
		shd.put(3, 343.3f);
		shd.put(4, "Ganesh");
		shd.put(5, "Hari");
		
		System.out.print("The key is present : ");
		System.out.print(shd.containsKey(3));
		
	}
	
//	Check whether a value exists in Map.
	
	public void checkValue() {
		
		HashMap mp = new HashMap();
		
		mp.put(1, "Ram");
		mp.put(2, 3434343434343l);
		mp.put(3, 343.3f);
		mp.put(4, "Ganesh");
		mp.put(5, "Hari");
		
		System.out.print("Check the map has the value Hari : ");
		System.out.print(mp.containsValue("Hari"));
	}
	
//	Remove an entry from Map using key.
	
	public void toremoveEntry() {
		System.out.println();
		
		System.out.println("Result after removing the entry of key 12: ");
		
		HashMap<Object, Object> gd = new HashMap<Object, Object>();
		
		gd.put(11, "Vector");
		gd.put(12, "Gorakh");
		gd.put(13, "Antheni");
		gd.put(14, "Dsuza");
		
		gd.remove(12);
		// Directly remove the existing Key
		for ( Entry<Object, Object>   y: gd.entrySet()) {
			
			
			System.out.println(y.getKey() +" " + y.getValue());
			
			
		}
	}
	
//	 Find the size of a Map.
	
	public void findSize() {
		
		HashMap df = new HashMap();
		
		df.put(11, "Vector");
		df.put(12, "Gorakh");
		df.put(13, "Antheni");
		df.put(14, "Dsuza");
		
		System.out.println("Size of the map is : ");
		System.out.println(df.size());
	}
	

}
