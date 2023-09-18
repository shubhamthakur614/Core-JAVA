
public class Multithreading_in_lambda 
{
	public static void main(String[] args) {
		Runnable r=()->
		{
			for (int i=1;i<=10;i++)
			{
				System.out.println(i*5);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*4);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
