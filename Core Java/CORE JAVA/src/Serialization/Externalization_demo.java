package Serialization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization_demo implements Externalizable {
	String s;
	int i;
	int j;

	public Externalization_demo(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeObject(i);

	}
	//this no argument constructor is called by jvm becz jvm 
//	will create object to initialize the default value to object

	public Externalization_demo()
	{
		
	}
//	 and on that object jvm will called readExternal method
	public void readExternal(ObjectInput oi)throws IOException, ClassNotFoundException
	{
		s=(String)oi.readObject();
		i=(Integer)oi.readObject();
		
		
	}
	public static void main(String[] args)throws Exception
	{
		Externalization_demo t=new Externalization_demo("SHUBHAM",10,20);
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Externalization_demo t2=(Externalization_demo)ois.readObject();
		System.out.println(t2.s+" "+t2.i+" "+t2.j+" ");
		
		
	}

}
