import java.util.function.*;

public class Predicateexp 
{
	public static void main(String[] args) 
	{
//		Predicate<Integer>p1=i->i%2==0;
//		System.out.println(p1.test(10));
//		System.out.println(p1.test(15));
//		WRP  to check string is grater than 5 character and show the name
		int [] arr= {1,2,4,3,5,6,8};
		Predicate<Integer>p=z->z%2==0;
		for(Integer i:arr)
		{
			if(p.test(i))
			{
				System.out.println(i);
			}
		}
		
	}

}
