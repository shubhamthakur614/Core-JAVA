import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Test6 {
	public static void main(String[] args) {
		int[] arr = { 0, 10, 20, 13, 15, 192, 77, 12, 77, 192, 132, 166, 2, 1 };
		IntStream stream = Arrays.stream(arr);
		List<Integer> list = Arrays.asList(0, 20, 13, 15, 192, 77, 12, 77, 192, 132, 166);
//	stream.sorted(Collections.reverseOrder().)
		int secNo = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secNo);
		Integer secSmall = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secSmall);
	}

}
