package com.Map.sortedmap.treemap;
import java.util.*;

//for default sorting order

public class Treemapdemo 
{
	public static void main(String[] args) 
	{
		TreeMap m=new TreeMap();
		
		m.put(101,"CAX");
		m.put(106,"AAA");
		m.put(102,"ABC");
		m.put(190,"ZXR");
		m.put(150,150);
		m.put(103,"SHUBHAM");
		//m.put(null,"SSSS");//NPE
		//m.put("AAA","FFF");//CCE
		System.out.println(m);
		
	}

}
