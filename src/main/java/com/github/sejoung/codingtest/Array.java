package com.github.sejoung.codingtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Array {


	//아스키 코드일때
	public static boolean isUniqueChars(String str) {
		// 아스키 코드는 128 자로 구성 되어 있고 해당 값만큼 boolean 배열로 검사를 함 같은 자리에 코드를 검사함
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}


	//아스키 코드가 아닐때
	public static boolean isUniqueCharsUTF8(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character val = str.charAt(i);
			if (Objects.nonNull(map.get(val))) {
				return false;
			}
			map.put(val, Integer.valueOf(0));
		}

		return true;
	}


	public static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static boolean prermutation(String s, String s1) {
		if (s.length() != s1.length()) {
			return false;
		}
		return sort(s).equals(sort(s1));

	}


	public static void main(String[] args) {
		System.out.println(Array.isUniqueChars("aaaa"));
		System.out.println(Array.isUniqueCharsUTF8("한글"));
	}

}
