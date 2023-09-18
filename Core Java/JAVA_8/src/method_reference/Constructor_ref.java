package method_reference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Constructor_ref 
{
	public static void main(String[] args) {
		
		//using lambda Expression
		
		List<String>fruit=new ArrayList<>();
		fruit.add("banana");
		fruit.add("apple");
		fruit.add("watermeloan");
		fruit.add("mango");
		fruit.add("banana");
		System.out.println(fruit);
		//i have to convert from list to  set 
		
		Function<List<String>,Set<String>>setFruit=(fruitList)->new HashSet<>(fruitList);
		System.out.println(setFruit.apply(fruit));
		
		//using constructoe method Ref
		Function<List<String>,Set<String>>setFruit1=HashSet::new;
		System.out.println(setFruit1.apply(fruit));
		
		
	}

}
