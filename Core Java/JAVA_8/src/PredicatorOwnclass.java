//when multiple condition you have to check better to go for predicate it will concise the code
import java.util.*;
import java.util.function.*;

class Employee1
{
	String name;
	double salary;
	char gender;
	Employee1(String name,double salary,char gender)
	{
		this.name=name;
		this.salary=salary;
		this.gender=gender;
	}
}
public class PredicatorOwnclass 
{
	public static void main(String[] args) 
	{
		List<Employee1> l=new ArrayList<Employee1>();
		l.add(new Employee1("Shubham",15000,'M'));
		l.add(new Employee1("Ravi",12000,'M'));
		l.add(new Employee1("Suraj",17000,'M'));
		l.add(new Employee1("Nehal",15000,'F'));
		l.add(new Employee1("Nehal",12400,'F'));
		l.add(new Employee1("Jasprit",10000,'F'));
		
		Predicate<Employee1>p=e->e.salary>12500 && e.gender=='M';
//		for(Employee1 e1:l)
//		{
//			if(p.test(e1))
//			{
//				System.out.println("Name: "+e1.name+" Salary: "+e1.salary+" Gender:  "+e1.gender);
//			}
//			else
//			{
//				l.stream().map(z-> {if(z.equals(e))
//					{
//					
//					});
//					}
//			}
//		};
//		
//		
//		
	}

}
