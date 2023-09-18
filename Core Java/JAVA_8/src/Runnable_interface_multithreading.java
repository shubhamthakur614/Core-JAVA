//how to create multithreading sing lymbda expression


public class Runnable_interface_multithreading 
{
	public static void main(String[] args) 
	{
		Runnable r=()->
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread: "+i);
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("MAIN Thread: "+i);
		}
		
	}

}
