

class Student1
{
	int rollno;
	String name;
	public Student1(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public String toString()
	{
		return "RollNo: "+rollno+" NAME:"+name;
	}
}
public class String_to_String 
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1(121,"SHUBHAM");
		Student1 s2=new Student1(122,"VIRAJ");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
