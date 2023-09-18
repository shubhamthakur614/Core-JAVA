package method_reference;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * Function interface structure and it has method apply
 * Function<T,R>
 * where t is i/p and r is output

 *   R apply(T t);
 * 
 */

public class Static_method 
{
	//for two i/p and one o/p case use bifunction
	
	public static int add(int a,int b)
	{
		return (a+b);
	}
	public static void main(String[] args) {
		//normal way by using lambda expression
		
		Function<Integer,Double>function=(n)->Math.sqrt(n);
		System.out.println(function.apply(2));
		
		//using method reference to replace the lambda by method reference
		//method refrence to static method
		Function<Integer,Double>functionMetthodRef=Math::sqrt;
		System.out.println(functionMetthodRef.apply(4));
		
		//how to handle two i/p and one o/p case
		BiFunction<Integer,Integer, Integer>bi=(a,b)->Static_method.add(a, b);
		System.out.println("Using Bi Function: "+bi.apply(10, 20));
		
		//using method refrence
		BiFunction<Integer,Integer, Integer>bimref=Static_method::add;
		System.out.println("Using Bi Function method refernce: "+bimref.apply(10, 20));
	}

}
