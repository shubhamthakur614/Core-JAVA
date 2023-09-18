import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_comparator_using_Lambda {
	public static void main(String[] args) 
	{
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(1);
		l.add(30);
		l.add(15);
		System.out.println(l);
		
		Comparator<Integer> c=(I1,I2) ->
		{
			 return (I1<I2)?-1:(I1>I2)?+1:0;
		};
		Collections.sort(l,c);
		System.out.println(l);
		
	}

}
