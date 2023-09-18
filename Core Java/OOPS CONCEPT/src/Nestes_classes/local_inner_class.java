package Nestes_classes;


class outer_class
{
	private int data=100;
	
	public void show()
	{
		class inner_class//local inner class
		{
			public void display()
			{
				System.out.println(data);
			}
		}
		inner_class i=new inner_class();
		i.display();
	}
}
public class local_inner_class 
{
	
    public static void main(String[] args) 
	{
		outer_class o=new outer_class();
		o.show();
	}

}
