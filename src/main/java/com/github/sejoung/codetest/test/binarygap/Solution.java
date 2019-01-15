package com.github.sejoung.codetest.test.binarygap;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        String binary = Integer.toBinaryString(N);
        int firstOneIdx = 0;
        int nextOneIdx = 0;

        for (int i = 0; i <= binary.length(); i++) {
            if (firstOneIdx == 0) {
                firstOneIdx = binary.indexOf("1");
            }

            nextOneIdx = binary.indexOf("1", firstOneIdx + 1);

            if (nextOneIdx == -1) {
                break;
            }

            int temp = nextOneIdx - firstOneIdx - 1;

            if (temp > result) {
                result = temp;
            }

            firstOneIdx = nextOneIdx;

        }


        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Random random = ThreadLocalRandom.current();

        int result = solution.solution(random.nextInt(2147483647));

        System.out.println(result);


    }
}
