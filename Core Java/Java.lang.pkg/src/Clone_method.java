
//protected native object clone(object o)throws CloneNotSupportedException
//object cloning in java

//cloneable ,serializable are the marker interface having no method inside it
class StUdent implements Cloneable
{
	int id;
	String name;
	double marks;
	public StUdent(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone(); 
	}
	public String toString()
	{
		return "Id:"+id+" Name:"+name+" Marks "+marks;
	}
}
public class Clone_method 
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		StUdent s=new StUdent(1,"SHUBHAM",60.33);
		StUdent s1=(StUdent)s.clone();
		System.out.println(s);
		System.out.println(s1);
		
		
		
		
	}

}
