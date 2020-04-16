package com.github.sejoung.codetest.generics.unbounded;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void printList(List<Object> list) {

		list.forEach((o) -> {
			System.out.println("printList " + o);
		});
	}

	public static void printList2(List<?> list) {

		list.forEach((o) -> {
			System.out.println("printList2 " + o);
		});
	}

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");
		List<Object> lo = Arrays.asList(1, "2", Boolean.TRUE);
		printList2(li);
		printList2(ls);
		printList(lo);

	}
}
