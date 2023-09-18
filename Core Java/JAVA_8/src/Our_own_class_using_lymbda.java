
import java.util.*;
class Employee
{
	int eid;
	String name;
	public Employee(int eid,String name)
	{
		this.eid=eid;
		this. name=name;
	}
	public String toString()
	{
		return eid+" : "+name ;
	}
}
public class Our_own_class_using_lymbda
{
	public static void main(String[] args)
	{
		List<Employee>l=new ArrayList<>();
		l.add(new Employee(8457213,"Shubham"));
		l.add(new Employee(111222,"Viraj"));
		l.add(new Employee(2122444,"KARTIK"));
		l.add(new Employee(151312,"Abhimanyu"));
		System.out.println(l);

		Collections.sort(l,(e1,e2)->(e1.eid<e2.eid)?-1:(e1.eid>e2.eid)?+1:0);
		System.out.println(l);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
		
		
		
		
		
	}

}