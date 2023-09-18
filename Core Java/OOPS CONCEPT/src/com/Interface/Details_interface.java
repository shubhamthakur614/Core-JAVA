package com.Interface;
interface Details
{
	void show();//by default jvm add the public abstract keyword
	
	//we can also use the static concrete method of version 8 above 
	
	  static void display() 
	  {
	  System.out.println("This is static concrete method in interface");
	  
	  } 
	  //we can also implement default concrete method also; 
	  default void showme()
	  { 
		  System.out.println("This is default concrete method in interface by java 8 above");
	  
	  }
	  private void ab()
	  {
		  System.out.println();
	  }
	
}
interface d1
{
	  void show();
}
class Interfacedetails implements Details,d1
{
	public void show()
	{
		System.out.println("this is public abstracted override method of interface ");
	
	}
	public void sho()
	{
		System.out.println("2nd interface by multiple inheritance acchived");
		
	}
	
	
 		
}


public class Details_interface 
{
	public static void main(String[] args) 
	{
		//in interface we can not create the object of interface like abstract;
		 Interfacedetails i=new Interfacedetails();
		 i.show();
		 i.sho();
		 
		
		
		
		
	}

}
