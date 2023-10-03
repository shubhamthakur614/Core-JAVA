package ASSIGNMENT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10, 2, 43, 1, 18, 45);
		int[] arr = { 10, 2, 43, 1, 18, 45 };
		String[] arr1= {"b","n","a"};

		Stream.of(arr1).sorted(Comparator.naturalOrder()).forEach(x -> {
			System.out.println(x);
		});

	}

}
