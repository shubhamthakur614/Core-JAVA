package Nestes_classes;

//a class which is declared inside class which dosent having any name that we called
 //anonymous inner class
//this class is used to override the method of abstract class and interface

abstract class man
{
	abstract public void eat();
}

public class Anonymous_inner_class//outer class
{
 
	public static void main(String[] args) 
	{
		man m=new man()
				{
			      public void eat()
			      {
			    	  System.out.println("EATING BANANA");
			      }
				};
				m.eat();
		
		
	}
}
