package Autoboxing_Unboxing;

public class Autoboxing_UnboxingDemo 
{
	static Integer I=10;//AutoBoxing(conversion of primitive to wrapper object by compiler);
	//internally Integer I=Integer.valueOf(10);
	public static void main(String[] args) 
	{
		int i=I;//AutoUnboxing(conversion of wrapper object to primitive type)
		//internally Integer I=new Integer(10)
		//int i=I.value();
		 m1(i);
		
	}
	
	public static void m1(Integer k)//AutoBoxing
	{
		int i=k;//AutoUnboxing
		System.out.println("AUTOBOXING AND AUTOUNBOXING: "+i);
	}
	

	
 

}
