package com.CollectionList;
import java.util.*;
class Book
{
	int id;
	String bookname,authorname;
	int price;
	
	Book(int i,String bn,String an,int p )
	{
		this.id=i;
		this.bookname=bn;
		this.authorname=an;
		
		this.price=p;
		
	}
	//we dont need to use object refrence to call every if you override to string method in your class
	public String toString()
	{
		return " BOOK ID: "+id+" Book Name: "+bookname+" AuthorName "+authorname;
	}
}

public class BookArrayListProject
{
	public static void main(String[] args)
	{
		
		
		Book b=new Book(121,"let'C","yashwant kanetkar",400);
		Book b1=new Book(131,"JAVA FUNDAMENTAL","James Gosling ",550);
		List <Book>l=new ArrayList<Book>();
		l.add(b);
		l.add(b1);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
