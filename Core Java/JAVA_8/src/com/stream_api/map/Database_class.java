package com.stream_api.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//act as database and where we get list
public class Database_class {
	public static List<Customer> getCustomer() {
		return Stream
				.of(new Customer(1, "Shubham", "shubham.thakur@yash.com", Arrays.asList("123456", "134267")),
						new Customer(2, "Vivek", "vivek.thakur@yash.com", Arrays.asList("134267", "123456")),
						new Customer(1, "Shubham", "shubham.thakur@yash.com", Arrays.asList("132267", "131267")),
						new Customer(1, "Shubham", "shubham.thakur@yash.com", Arrays.asList("120456", "129456")))
				.collect(Collectors.toList());
	}

}
