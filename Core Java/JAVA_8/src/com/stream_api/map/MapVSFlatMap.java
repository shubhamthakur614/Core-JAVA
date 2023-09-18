package com.stream_api.map;

import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMap 
{
	public static void main(String[] args) {
		List<Customer>lc=Database_class.getCustomer();
		//data transformation
//		get data of object and from that object find email object and return stream
		
		//map() is used to one to one maaping
		List<String> collectEmail = lc.stream().map(cus ->cus.getEmail()).collect(Collectors.toList());
	System.out.println(collectEmail);
	
	//if you try to perform one to many then data is Flattening
	//we get list of list not single list
	List<List<String>> collectphone = lc.stream().map(cus->cus.getPhone()).collect(Collectors.toList());
	System.out.println(collectphone);
	
	//so in this case we use flatMap() to get Flattening data
	//but it require stream<stream>>
	List<String> phone = lc.stream().flatMap(cus->cus.getPhone().stream()).collect(Collectors.toList());
	System.out.println(phone);
	}

}
