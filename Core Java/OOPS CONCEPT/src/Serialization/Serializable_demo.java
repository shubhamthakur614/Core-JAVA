package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	int i=10;
	int j=20;
	
}

public class Serializable_demo
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Dog d=new Dog();
		//serialization
		FileOutputStream fos=new FileOutputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\Java\\OOPS CONCEPT\\src\\Serialization\\abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		//deserialization
		
		FileInputStream fis=new FileInputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\Java\\OOPS CONCEPT\\src\\Serialization\\abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		
		System.out.println(d2.i+" "+d2.j);
		
		
		
	}

}
