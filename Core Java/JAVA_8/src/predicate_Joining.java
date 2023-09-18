import java.util.function.*;

public class predicate_Joining
{
	public static void main(String[] args) {
		int[] x= {0,5,10,15,20,25,30,35};
		
		//to find even no
		Predicate<Integer>p1=i->i%2==0;
		
		Predicate<Integer>p2=i->i>10;
		//and(),or(),negate()if you dont want even then use negate
		System.out.println("Even and greater than 10 No are:");
		for(Integer i2:x)
		{
			if(p1.or(p2).test(i2))
			{
				System.out.println(i2);
			}
		}
	}

}
