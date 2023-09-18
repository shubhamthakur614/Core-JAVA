package optional;

import java.util.Optional;

import javax.management.InstanceNotFoundException;

//it is a single value Container

//this is util class it use to avoid the null checks and null pointer exceptions

public class OptionalDemo {
	public static void main(String[] args) {
		// how to create object of Optional class using 3 static method

		String name = "shubham";

		// empty() return empty optional class empty object
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);

		// of() use only if u sure about object is not empty otherwise throw exception
		Optional<String> of = Optional.of(name);
		System.out.println(of);

		// ofNullable if not not sure object is null or not use this method this wont
		// throw exception if object is null it return optional class empty object

		Optional<String> stringOptional = Optional.ofNullable(name);
		System.out.println(stringOptional);
		
		//Optional Class Instance Method
		String email="shubham.thakur@yash.com";
		
		//get() it return exception(NoSuchElementException) if object is null
		Optional<String> ofNullable1 = Optional.ofNullable(email);
		//System.out.println(ofNullable1.get());
		
		//but we never use get() direct we use ispresent()
		
		if(ofNullable1.isPresent())
		{
			System.out.println(ofNullable1.get());
		}
		else
		{
			System.out.println("email is not Present");
		}
		
		//ifPresent(take  lamdba expression)
		Optional<String>gender=Optional.of("Male");
		gender.ifPresent((s)->
		{
			System.out.println("Value is present");
		});
		Optional<String>gender1=Optional.empty();
		gender1.ifPresent((s)->
		{
			System.out.println("Not present");
		});
		
		//orElse() return the defalut value
		String add="chikhli";
		Optional<String>opt=Optional.ofNullable(add);
		System.out.println(opt.orElse("defalut value"));
		
		//orElseGet() same as orElse only want i/p as lamda
		
		//orElseThrow(lamda()->)
		
		String orElseThrow = opt.orElseThrow(()->new IllegalArgumentException("not available"));
		System.out.println(orElseThrow);
		
		//filter()
		
		String str="   ABC    ";
		
		Optional<String> optstr = Optional.ofNullable(str);
		
		optstr.filter(s->s.contains("ABC"))
		.map(String::trim)
		.ifPresent((s)->
		{
			System.out.println(s);
		});
		
		
		

	}

}
