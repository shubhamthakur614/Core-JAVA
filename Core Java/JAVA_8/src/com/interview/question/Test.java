package com.interview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<List<Integer>> output = IntStream.range(0, (input.size() + 1) / 2)
                .mapToObj(i -> {
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(input.get(i * 2));
                    if (i * 2 + 1 < input.size()) {
                        sublist.add(input.get(i * 2 + 1));
                    }
                    return sublist;
                })
                .collect(Collectors.toList());

        System.out.println(output);

	}
}
