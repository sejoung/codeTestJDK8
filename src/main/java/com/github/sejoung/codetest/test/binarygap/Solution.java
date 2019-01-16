package com.github.sejoung.codetest.test.binarygap;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        // 먼저 2진수로 변환
        String binary = Integer.toBinaryString(N);
        // 첫번째 1 위치
        int firstOneIdx = 0;
        // 다음 1 위치
        int nextOneIdx = 0;

        // 전체 loop는 2진수 길이가 최대
        for (int i = 0; i <= binary.length(); i++) {

            // 첫번째만 인덱스 체크
            if (i == 0) {
                firstOneIdx = binary.indexOf("1");
            }

            // 첫번째 인덱스 다음 1 찾기
            nextOneIdx = binary.indexOf("1", firstOneIdx + 1);

            // 다음 1이 없으면 loop 나옴
            if (nextOneIdx == -1) {
                break;
            }

            // 갭
            int temp = nextOneIdx - firstOneIdx - 1;

            // 현제 갭이 이전보다 크면 결과 담음
            if (temp > result) {
                result = temp;
            }

            // 첫번째 인덱스를 이동
            firstOneIdx = nextOneIdx;
        }

        return result;
    }

    private int solution2(int N) {
        final String GAP = "1";
        String binaryString = Integer.toBinaryString(N);
        int returnSolutionSize = 0;
        String[] tempSizeChk = binaryString.split(GAP);
        int lastChk = 0;
        if (binaryString.lastIndexOf(GAP) != binaryString.length()-1) lastChk = 1;
        if (binaryString.startsWith(GAP) && 1 >= tempSizeChk.length && lastChk == 0) return 0;
        for (int i = 0; i < tempSizeChk.length-lastChk; i++) {
            String temp = tempSizeChk[i];
            if(temp.length() > returnSolutionSize) returnSolutionSize = temp.length();
        }
        return returnSolutionSize;

    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        Random random = ThreadLocalRandom.current();

        for (int i = 0; i < 10000; i++) {

            int input = random.nextInt(2147483647);
            int result = solution.solution2(32);

            System.out.println("input = " + input + " result = " + result);
        }

    }
}
