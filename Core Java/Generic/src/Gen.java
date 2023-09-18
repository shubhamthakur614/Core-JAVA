


class MyGen<T>
{
	T obj;
	MyGen(T obj)
	{
		this.obj=obj;
	}
	
	public T getclass()
	{
		return obj;
	}
	public void show()
	{
		System.out.println("Type of Class Object is: "+obj.getClass().getName());
	}
	
}
public class Gen 
{
	public static void main(String[] args) 
	{
		MyGen<Integer>m=new MyGen<>(10);
		m.show();
		MyGen<String>m1=new MyGen<>("Shubham");
		m1.show();
		
		
	}

}
