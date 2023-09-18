package Autoboxing_Unboxing;

//if you want ot perform boxing there are two way
//one by using constructor and another by using valueOf();

public class Details
{
	public static void main(String[] args) 
	{
		//boxing using constructor
		
		Integer obj1=new Integer(123);
		Integer obj2=new Integer("345");
//		if you try to bind string data directly we get exception NumberFormatException
//		Integer obj5=new Integer("ABC");
		
		
		//boxing with the help of valueOf()

		Integer obj3=Integer.valueOf(456);
		Integer obj4=Integer.valueOf("678");
		
		//Auto unboxing
		int i=obj1.intValue();
		int j=obj3.intValue();
		
//		to call string object value we use to string method;
		
		String s=obj2.toString();
		System.out.println(i);
		System.out.println(j);
		System.out.println(s);
		
	}

}
