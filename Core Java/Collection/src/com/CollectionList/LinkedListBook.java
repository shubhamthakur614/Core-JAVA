package com.CollectionList;

import java.util.LinkedList;

class Books
{
	String bookname;
	String authorname;
	float price;
	public Books(String bn,String an,float p)
	{
		bookname=bn;
		authorname=an;
		price=p;
	}
}

public class LinkedListBook 
{
	public static void main(String[] args)
	{
		Books b1=new Books("LET'C", "YASHWANT KANETKAR", 650.12f);
		Books b2=new Books("JAVA", "JAMES GOSLING", 1200.75f);
		Books b3=new Books("HTML", "HTML AUTHOR", 200.12f);
		Books b4=new Books("MRUTUNJAY", "SHIVAJI SAWANT", 560.17f);
		
		LinkedList<Books>ll=new LinkedList<Books>();
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		ll.add(b4);
		
		for(Books bb:ll)
		{
			System.out.println(bb.bookname+" "+bb.authorname+" "+bb.price);
		}
		
		
		
		
	}

}
