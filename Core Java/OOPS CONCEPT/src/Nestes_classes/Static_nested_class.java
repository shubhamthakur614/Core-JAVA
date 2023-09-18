package Nestes_classes;

public class Static_nested_class //outerclass
{
	private static int data=10;
	static class inner//staic inner class
	{
		public void m1()//for instance method inside static class
		{
			System.out.println("Using the instance method inside static nested class:"+data);
		}
		public static void m2()//static method inside static class
		{
			System.out.println("Using the static method inside the static nested class:"+data);
		}
	}
	public static void main(String[] args) 
	{
		//you dont need to create the object of inner class becz its static
		Static_nested_class.inner i=new Static_nested_class.inner();
		i.m1();
		//to call static method inside static class you only have to call
		//outer class nam.inner class name.method no need to create any object
		Static_nested_class.inner.m2();
	}

}
