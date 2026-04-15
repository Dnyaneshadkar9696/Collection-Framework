package sirquestions;

import java.util.ArrayList;
import java.util.Iterator;

public class Ecommerce {

	// question first

//	managing product in e commerce and 
//	each product has name and price so the concept of map comes here

	public void callingE() {
		this.addProducts();
		
		System.out.println();
		this.productwithHigestPrice();
	}

	public void addProducts() {

//		in arraylist in object we can store multiple products

		ArrayList<Product> h = new ArrayList<Product>();

		// so basically here the arrayList stores the product objects with the name and
		// the price

		h.add(new Product("Laptop", 50000));
		// see clearly we are passing the constructor with its values so this values
		// goes in product
		h.add(new Product("Phone", 34000));

		h.add(new Product("HeadPhone", 4500));
		System.out.println("List of the products and its prices");
//		System.out.println(h);
		// i cannot print the reference it is not the atual data

		Iterator<Product> j = h.iterator();

		while (j.hasNext()) {

			Product p = j.next();

			System.out.println(p);
			// it will print the data into the string format
		}

	}

	// Question 2nd

//	Find product with highest price

	public void productwithHigestPrice() {

		ArrayList<Product> r = new ArrayList<Product>();

		r.add(new Product("laptop", 50000));
		r.add(new Product("mobile", 44000));
		r.add(new Product("headphone", 47000));
		r.add(new Product("tablet", 76000));
		r.add(new Product("ac", 57000));
		r.add(new Product("router", 5000));
		r.add(new Product("pendrive", 500));

		// we have to find the product with the highest price

		Iterator<Product> y = r.iterator();

		Product higest = y.next();
		// we take here is the first product

		while (y.hasNext()) {

			Product p = y.next();
			// we store  each product in p including the p

			if (p.price > higest.price) {
				// checked the price of p and the higest product which is the first product
				higest = p;
			}

		}
		
		System.out.println("The product with the higest price is "+ higest);

	}

	//	Sort products by price (ascending & descending)
	
	public void productSort() {
		
		ArrayList<Product> q = new ArrayList<Product>();

		q.add(new Product("laptop", 50000));
		q.add(new Product("mobile", 44000));
		q.add(new Product("headphone", 47000));
		q.add(new Product("tablet", 76000));
		q.add(new Product("ac", 57000));
		q.add(new Product("router", 5000));
		q.add(new Product("pendrive", 500));
		
		Collections.sort(q, (a,b) -> a.price - b.price);
		
		// lambda expression used here
//		it is shortcut to get the comparator
		
		System.out.println("Ascendig order : ");
		for(Product df : q){
			System.out.println(df);
		}
		
		System.out.println("Descending order: ");
		Collections.sort(q, (a,b) -> b.price - a.price);
		
	    for(Product ds : q) {
	    	System.out.println(ds);
	    }
		
		
		
	}
	
	
	
	
//	Filter products with price > 500
	
	public void priceFilter() {
		ArrayList<Product> c = new ArrayList<Product>();

		c.add(new Product("laptop", 50000));
		c.add(new Product("mobile", 44000));
		c.add(new Product("headphone", 47000));
		c.add(new Product("tablet", 76000));
		c.add(new Product("ac", 57000));
		c.add(new Product("router", 5000));
		c.add(new Product("pendrive", 500));
		
		System.out.println("Products with the price greater than 500 : ");
		for(Product u : c) {
			if(u.price > 500) {
				System.out.println(u);
			}
		}
		
	}
	
	//Remove duplicate product names
	
	public void removeDuplicateProducts() {
		
		ArrayList<Product> k = new ArrayList<Product>();

		k.add(new Product("laptop", 50000));
		k.add(new Product("mobile", 44000));
		k.add(new Product("headphone", 47000));
		k.add(new Product("tablet", 76000));
		k.add(new Product("ac", 57000));
		k.add(new Product("ac", 5000));
		k.add(new Product("pendrive", 500));
		
		
		ArrayList<String> uniq = new ArrayList<String>();
		
		Iterator<Product> p = k.iterator();
		System.out.println("Unique elements : ");
		while(p.hasNext()) {
			
			Product y = p.next();
			
			if(!uniq.contains(y.name)) {
				uniq.add(y.name);
				System.out.println(y);
			}
			
			
		}
	}

}

class Product {

	String name;
	double price;

	// This is constructor of the product class

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	// product class knows how to display its elements

}
