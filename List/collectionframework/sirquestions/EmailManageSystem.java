package sirquestions;

import java.util.ArrayList;
import java.util.Iterator;

public class EmailManageSystem {
	
//	Tasks:
//		Remove duplicate emails
//		Validate emails (must contain @ and .)
//		Group emails by domain (gmail, yahoo, etc.)
//		Count how many users per domain
//		Sort emails by domain name
	
	public void call() {
		
		System.out.println();
		System.out.println("************Email Management System************");
		System.out.println();
		
		
		this.removeDuplicateEmail();
		System.out.println();
		
		this.validateEmail();
		System.out.println();
		
		this.groupDomain();
		System.out.println();
		
		this.countPerDomain();
		
	}
	
	public void removeDuplicateEmail() {
		ArrayList<String> e = new ArrayList<String>();
		
		e.add("ram@gmail.com");
		e.add("sham@gmail.com");
		e.add("ganesh@gmail.com");
		e.add("suraj@gmail.com");
		e.add("ram@gmail.com");
		
		ArrayList<String> y = new ArrayList<String>();
		Iterator<String> t = e.iterator();
		System.out.println("No duplicates : ");
		while(t.hasNext()) {
			String s = t.next();
			
			if(!y.contains(s)) {
				y.add(s);
				System.out.println(s);
			}
		}
	}
	
	// Validate emails (must contain @ and .)
	
	public void validateEmail() {
		
       ArrayList<String> j = new ArrayList<String>();
		
		j.add("ram@gmail.com");
		j.add("sham@gmail.com");
		j.add("ganesh@gmail.com");
		j.add("suraj@gmail.com");
		j.add("ram@gmailcom");
		
		System.out.println("Check email is valid or not : ");
		Iterator<String> u = j.iterator();
//		char a = '@';
//		char b = '.';
		while(u.hasNext()) {
			String s = u.next();
			
			if(s.contains("a") && s.contains(".")) {
				
				// contains only checks the string
				System.out.println("email is valid");
				
			}
			else {
				System.out.println("email is invalid");
			}
		}
		
	}
	
//	Group emails by domain (gmail, yahoo, etc.)
	
	public void groupDomain() {
		  ArrayList<String> l = new ArrayList<String>();
			
			l.add("ram@gmail.com");
			l.add("sham@gmail.com");
			l.add("ganesh@yahoo.com");
			l.add("suraj@gmail.com");
			l.add("ram@yahoo.com");
			
			Iterator<String> m = l.iterator();
			ArrayList gmail = new ArrayList();
			ArrayList yahoo = new ArrayList();
			while(m.hasNext()) {
				String p = m.next();
				
				if(p.contains("gmail")) {
					
					// contains only checks the string
					gmail.add(p);
					
				}
				else if(p.contains("yahoo")){
					
					yahoo.add(p);
				}
			}
		System.out.println("Mail of gmail : ");
		System.out.println(gmail);
		System.out.println();
		System.out.println("Mail of Yahoo : ");
		System.out.println(yahoo);
	}
	
	////		Count how many users per domain
	
	public void countPerDomain() {
		ArrayList<String> o = new ArrayList<String>();
		
		o.add("ram@gmail.com");
		o.add("sham@gmail.com");
		o.add("ganesh@yahoo.com");
		o.add("suraj@gmail.com");
		o.add("ram@yahoo.com");
		
		System.out.println("Count of Domain wise users : ");
		Iterator<String> m = o.iterator();
		int countE = 0 ;
		int countY = 0;
		while(m.hasNext()) {
			String p = m.next();
			
			if(p.contains("gmail")) {
				
			countE++;
				
			}
			else if(p.contains("yahoo")){
				
			countY++;
			}
		}
		
		System.out.print("Count of Gmail users : ");
		System.out.println(countE);
		System.out.print("Count of Yahoo users : ");
		System.out.println(countY);
		
	}

}
