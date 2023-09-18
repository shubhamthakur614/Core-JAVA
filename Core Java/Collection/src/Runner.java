import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner 
{
	public static void main(String[] args) 
	{
		List<laptop> l=new ArrayList<>();
		l.add(new laptop("Dell",12,780));
		l.add(new laptop("Apple",14,1965));
		l.add(new laptop("Lenovo",8,500));
		Collections.sort(l);
		for(laptop lp:l)
		{
			System.out.println(lp);
		}
		
		
		
		
	}

}
