import java.util.HashMap;
import java.util.Map;

class Employee
{
	int id;
	public Employee(int id)
	{
		this.id=id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
public class Hashcode_equals
{
	public static void main(String[] args) {
		
	
  Employee e=new Employee(1);
  Employee e1=new Employee(1);
  HashMap<Employee,String> map=new HashMap<Employee,String>();
  map.put(e,"abc");
  map.put(e1,"abc");
  System.out.println(map.size());
  System.out.println(map.entrySet());
  
  
  Integer i1=new Integer(1);
  Integer i2=new Integer(1);
  
Map<Integer,String>map1=new HashMap<>();
map1.put(i1, "one");
map1.put(i2, "one");
System.out.println(map1.size());

//becz all wrapper classes allready override the equals and hashcode method and as two object
//hashcode is same equals method will check the content if content equals then it is duplicate
//which are not allowed in the map. thats why 1 and employee class not duplicated so 2
//if you want the same for your employee calss generate hashcode and equals method
// then we will get same o/p
//if you want to check use entryset() method to get how many key is added
  
  
	}
}
