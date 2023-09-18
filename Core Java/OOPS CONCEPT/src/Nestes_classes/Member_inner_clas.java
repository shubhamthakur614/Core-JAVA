package Nestes_classes;
//member inner class which is created inside class but outside the method

public class Member_inner_clas //outer class
{
	private int data=100;
	//you can access private variable data of outer class  from inner class 
	
	public class Inner//inner class
	{
		public void show()
		{
			System.out.println(data);
		}
	}
	public static void main(String[] args) 
	{
		//how we can access the value from inner class
		
		Member_inner_clas o=new Member_inner_clas();
		Member_inner_clas.Inner i=o.new Inner();
		i.show();
		
		
	}

}
