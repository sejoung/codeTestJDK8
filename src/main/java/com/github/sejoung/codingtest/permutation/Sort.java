package com.github.sejoung.codingtest.permutation;

import java.util.Arrays;
import org.springframework.util.Assert;

public class Sort {

	private static String sort(String s) {
		char[] contents = s.toCharArray();
		Arrays.sort(contents);
		return new String(contents);
	}

	public static void main(String[] args) {

		Assert.isTrue(permutation("abc", "bca"), "정상 데이터 에러");
		Assert.isTrue(!permutation("abcdef", "bca"), "길이 체크 에러");
		Assert.isTrue(!permutation("abc", "bcf"), "에러 데이터 에러");

	}

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
}
