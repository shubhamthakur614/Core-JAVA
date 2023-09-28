import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test7 {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the No:");
//		int n = sc.nextInt();
//		System.out.println(isHappyNo(n));
//		System.out.println(isHappy(n));
//
//	}
//
//	public static boolean isHappyNo(int n) {
//
//		Set<Integer> hs = new HashSet<>();
//		while (true) {
//
//			n = square(n);
//			if (n == 1) {
//				return true;
//			}
//			if (hs.contains(n)) {
//				return false;
//			}
//			hs.add(n);
//		}
//
//	}
//
//	public static int square(int n) {
//
//		int rem = 0;
//		int sum = 0;
//		while (n != 0) {
//			rem = n % 10;
//			sum += rem * rem;
//			n = n / 10;
//		}
//		return sum;
//	}
//
//	public static boolean isHappy(int n) {
//		int slow, fast;
//		slow = fast = n;
//		do {
//			slow = square(slow);
//
//			fast = square(square(fast));
//		} while (slow != fast);
//		return (slow == 1);
//	}

	public static void main(String[] args) {
		String name = "shubham is a boy. boy shubham can do. shubham can be a ";
//		repeatedCharacter(name);
		repeatString(name);

	}

	public static void repeatedCharacter(String name) {
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length() - 1; j++) {
				if (name.charAt(i) == name.charAt(j)) {
					System.out.println(name.charAt(i) + " ");
				}
			}
		}

	}

	public static void repeatString(String name) {
		Map<String, Integer> hm = new HashMap<>();
		String[] words = name.split(" ");
		for (String word : words) {
			if (hm.get(word) == null) {
				hm.put(word, 1);
			} else {
				hm.put(word, hm.get(word) + 1);
			}
		}

		for (Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
