package Nestes_classes;

interface outer
{
	public void m1();
	
	//interface inside interface is by defalut is public and static 
	interface inner
	{
		public void msg();
	}
}

public class Nested_interface_interface implements outer.inner
{
	public void msg()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		outer.inner i=new Nested_interface_interface();//upper casting
		i.msg();
		
	}
	
	

}
