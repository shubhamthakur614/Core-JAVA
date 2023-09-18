package IMP;
class Student
{
	
}
class Customer
{
	
}

public class New_vs_newInstance 
{
	public static void main(String[] args)throws Exception 
	{
		Object o=Class.forName(args[0]).newInstance();
		System.out.println("OBJECT IS CREATED FOR:"+o.getClass().getName());
	}

}
