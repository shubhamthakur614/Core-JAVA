package Nestes_classes;
//we can create the class outside main method as well

abstract class Test
{
	abstract public void m1();
	
}
//without extending the parent abstract class we can override the method this is facility of 
//annonymous inner class

public class Anonymous2 
{
	//outside the main class how we can acces the data and call the method
	Test t=new Test()
			{
				public void m1()
				{
					System.out.println("We are overriding the abstract class method using anonymous class");
					
				}
			};
	public static void main(String[] args)
	{
		//to call here first create current class object and then 
		Anonymous2 a=new Anonymous2();
		a.t.m1();
		
		
	}

}
