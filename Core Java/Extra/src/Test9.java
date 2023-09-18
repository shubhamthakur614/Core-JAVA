import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shubham.thakur
 *
 */
class employee {
	int id;
	String name;
	int age;
	List<String> phone;

	employee(int id, String name, int age, List<String> phone) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

}

public class Test9 {
	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 40, 50 };
//		int a = 123;
//		String name = "shubham";
//		reverseArray(arr);
//		reverseString(name);
//		reversenumber(a);
		List<employee> all = getAll();
		List<String> collect = all.stream().map(employee->employee.getName()).collect(Collectors.toList());
		System.out.println(collect);

	}

	public static List<employee> getAll() {
		return Stream.of(new employee(1, "shubham", 24, Arrays.asList("1234", "4567")),
				new employee(2, "akash", 27, Arrays.asList("5214", "4567")),
				new employee(3, "rakesh", 29, Arrays.asList("1234", "2568"))).collect(Collectors.toList());
	}

	public static void reverseArray(int[] arr) {

		int first = 0;
		int last = arr.length - 1;

		while (first < last) {
			int temp = arr[last];
			arr[last] = arr[first];
			arr[first] = temp;
			first++;
			last--;

		}
		System.out.println(Arrays.toString(arr));
	}

	public static void reverseString(String name) {
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		System.out.println(rev);
	}

	public static void reversenumber(int a) {
		int rem = 0;
		int rev = 0;
		while (a > 0) {
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println(rev);

	}

}
