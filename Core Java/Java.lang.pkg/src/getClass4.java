import java.lang.reflect.Method;
//public final Class getClass();
public class getClass4 
{
	public static void main(String[] args) 
	{
		
		int count=0;
		Object o=new String("SHUBHAM");
		Class c=o.getClass();
		System.out.println("Fully QUALIFIED NAME OF CLASS:"+c.getName());
		Method m[]=c.getDeclaredMethods();
		System.out.println("METHOD INFORMATION:");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("TOTAL METHODS:"+count);
		
	
	}

}
