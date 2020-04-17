package com.github.sejoung.codingtest.permutation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.springframework.util.Assert;

public class Count {

	public static void main(String[] args) {

		Assert.isTrue(permutation("abc", "bca"), "정상 데이터 에러");
		Assert.isTrue(!permutation("abcdef", "bca"), "길이 체크 에러");
		Assert.isTrue(!permutation("abc", "bcf"), "에러 데이터 에러");
		Assert.isTrue(permutationUTF8("abc", "bca"), "정상 데이터 에러");
		Assert.isTrue(!permutationUTF8("abcdef", "bca"), "길이 체크 에러");
		Assert.isTrue(!permutationUTF8("abc", "bcf"), "에러 데이터 에러");
		Assert.isTrue(permutationUTF8("한글", "글한"), "한글 정상 데이터 에러");
		Assert.isTrue(!permutationUTF8("대한민국", "국민한"), "한글 길이 체크 에러");
		Assert.isTrue(!permutationUTF8("홍길동", "슈퍼맨"), "한글 에러 데이터 에러");

	}

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		// 아스키 코드만 확인
		int[] letters = new int[128];
		char[] s_arrays = s.toCharArray();
		for (char c : s_arrays) {
			letters[c]++;
		}
		char[] t_arrays = t.toCharArray();
		for (char c : t_arrays) {
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
		}
		return true;
	}


	public static boolean permutationUTF8(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character val = s.charAt(i);
			Integer count = map.getOrDefault(val, 0);
			if (Objects.nonNull(count)) {
				count = count + 1;
			}
			map.put(val, count);

		}

		for (int i = 0; i < t.length(); i++) {
			Character val = t.charAt(i);
			Integer count = map.get(val);
			if (Objects.isNull(count)) {
				return false;
			}

			int countMinus = count - 1;
			if (countMinus < 0) {
				return false;
			}
			map.put(val, countMinus);
		}

		return true;
	}
}
