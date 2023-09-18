package com.StringBuffer;
/*ALL the method in SB are synchronized that means thread 
 * safe only one thread at a time can access .
 * 1)public synchronized StringBuffer append(String s);
 * 2)public synchronized int length();
 * 3)public synchronized int capacity();
 * 4)public synchronized char charAt(int index);
 * 5)public synchronized char setCharAt(int index,character);
 * 6)public synchronized SB replace(int index,string);
 * 7)public synchronized SB insert(int index,string);
 * 8)public synchronized SB delete(start index,end index); 
 * 9)public synchronized void deleteCharAt();
 * 10)public synchronized SB reverse();
 * 11)public synchronized void setLength();
 * 12)public synchronized void ensurecapacity();
 * 13)public synchronized void trimToSize();
 */
public class SB_Methods 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Shubham");
		System.out.println(sb.append("THAKUR"));
		
		StringBuffer sb2=new StringBuffer("DINESH");
		System.out.println(sb2.length());
		
		StringBuffer sb3=new StringBuffer("Rakesh");//initially 16 + length of String
		System.out.println(sb3.capacity());
		
		StringBuffer sb4=new StringBuffer("SNEHA");
		System.out.println(sb4.charAt(3));
		
		StringBuffer sb5=new StringBuffer("KARISHMA");
		System.out.println(sb5.insert(4, 'X'));
		
		StringBuffer sb6=new StringBuffer("DAMINI");
		System.out.println(sb6.replace(1,4,"Z"));
		
		StringBuffer sb7=new StringBuffer("SHUBHAMTHAKUR");
		sb7.setLength(7);//to get only desire length string only
		System.out.println(sb7);
		
		StringBuffer sb8=new StringBuffer("SHUBHAMTHAKUR");
		System.out.println(sb8.capacity());
		sb8.ensureCapacity(1000);//
		System.out.println(sb8.capacity());
		
		StringBuffer sb9=new StringBuffer(1000);
		System.out.println(sb9.capacity());
		sb9.append("RAKESH");
		sb9.trimToSize();
		System.out.println(sb9.capacity());
		
		StringBuffer sb10=new StringBuffer("Shubham");
		System.out.println(sb10.reverse());
		
		
		
		
		
		
		
	}

}
