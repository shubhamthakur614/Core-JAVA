package method_reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

/* some time in lamdba expression we use method argument then this is 
 * oribitary use
 * 
 */
public class Orbitary_method_ref 
{
	public static void main(String[] args) {
		
		//lambda expression
		Function<String,String>f=(input)->input.toUpperCase();
		System.out.println(f.apply("shubham"));
		
		//using arbitary ref
		Function<String,String>f2=String::toLowerCase;
		System.out.println(f2.apply("SHUBHAM"));
		
		//take another example to understand
		String[] sarr= {"A","E","I","O","U","a","e","i","o","u"};
		Arrays.sort(sarr, (a,b)->a.compareToIgnoreCase(b));
		System.out.println(Arrays.toString(sarr));
		
		//using method reference
		String[] sarr1= {"A","E","I","O","U","a","e","i","o","u"};
		Arrays.sort(sarr1, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(sarr1));
		
		
	}

}
