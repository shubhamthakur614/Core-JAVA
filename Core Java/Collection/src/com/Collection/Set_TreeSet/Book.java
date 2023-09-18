package com.Collection.Set_TreeSet;

import java.util.TreeSet;

class Mybook implements Comparable<Mybook>
{
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Mybook(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
	
	public int compareTo( Mybook b)
	{
		if(id<b.id)
		{
			return -1;
		}
		else if(id>b.id)
		{
			return+1;
		}
		else
			return 0;
	}

	
	
}

public class Book 
{
	public static void main(String[] args)
	{
		TreeSet<Mybook> t=new TreeSet<Mybook>();
		
		Mybook b1=new Mybook(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		Mybook b2=new Mybook(233,"Operating System","Galvin","Wiley",6);  
		Mybook b3=new Mybook(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		
		t.add(b1);
		t.add(b2);
		t.add(b3);
		
		for(Mybook bb:t)
		{
			System.out.println(bb.id+" "+bb.name+" "+bb.author+" " +bb.publisher+" "+bb.quantity);
		}
		
		
	}

}
