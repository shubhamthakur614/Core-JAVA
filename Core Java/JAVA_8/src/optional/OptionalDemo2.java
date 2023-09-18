package optional;

import java.util.List;

import com.stream_api.map.Customer;
import com.stream_api.map.Database_class;

public class OptionalDemo2 {
	public static Customer getEmail(String email) {
		List<Customer> lc = Database_class.getCustomer();
		return lc.stream().filter(cus -> cus.getEmail().equals(email))
				.findAny()
				.get();
	}
	public static void main(String[] args) {
		System.out.println(getEmail("vivek.thakur@yash.com"));
	}

}
