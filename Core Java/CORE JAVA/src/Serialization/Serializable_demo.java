package Serialization;
import java.io.*;
class A implements Serializable
{
	int a=10;
	int b=20;
	
}

public class Serializable_demo 
{
	public static void main(String[] args)throws Exception 
	{
		A a=new A();
		//Serialization
		FileOutputStream fos=new FileOutputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\Java\\OOPS CONCEPT\\src\\Serialization/abc.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		//DeSerialization
		FileInputStream fin=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		A a1=(A)ois.readObject();
		//it gives in the form of object so that why typecasting 
		System.out.println(a1.a+":A "+a1.b+" :B");
		
		
	}

}
