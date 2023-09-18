import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
	public static void main(String[] args) {
		String s = "hello i am Shubham i am good at java";
		String[] words = s.split(" ");
		Map<String, Integer> hm = new LinkedHashMap<>();

		for (int i = 0; i < words.length; i++) {
			Integer count = hm.get(words[i]);
			if (count == null) {
				hm.put(words[i], 1);
			} else {
				hm.put(words[i], ++count);
			}

		}
		System.out.println(hm);

//		for (int i = 0; i < words.length; i++) {
////			if (hm.get(words[i]) != 0) {
//				System.out.print(words[i] + " : ");
//				System.out.println(hm.get(words[i]));
////				hm.put(words[i], 0);
////			}
//		}

	}

}
