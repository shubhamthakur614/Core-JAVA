
class MyStudent3
{
	int id;
	String name;
	public MyStudent3(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
}
public class EqualsMethod3
{
	
	
	public static void main(String[] args)
	{
		MyStudent3 m1=new MyStudent3(1,"SHUBHAM");
		MyStudent3 m2=new MyStudent3(2,"Viraj");
		MyStudent3 m3=new MyStudent3(1,"SHUBHAM");
		MyStudent3 m4=m1;
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));//false becz object class equals method meant or reference comparison not for contain comparison
		System.out.println(m4.equals(m1));
		//but if we want the content comparison  override the equals method();
		
		
		
	}

}
