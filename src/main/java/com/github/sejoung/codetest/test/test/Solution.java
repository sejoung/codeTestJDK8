package com.github.sejoung.codetest.test.test;

public class Solution {

    private final static int ZERO = 0;

    private final static String CODILITY = "Codility";

    private final static String TEST = "Test";
    private final static String CODER = "Codility";


    public void solution(int N) {
        // write your code in Java SE 8


        for (int i = 1; i <= N; i++) {

            int two = i % 2;
            int three = i % 3;
            int five = i % 5;

            if (two == ZERO || three == ZERO || five == ZERO) {
                String str ="";
                if (i % 2 == 0)
                    str = str + "Codility";
                if (i % 3 == 0)
                    str = str + "Test";
                if (i % 5 == 0)
                    str = str + "Coders";


            }else{

            }






        }


    }

    public static void main(String[] args) {

        Solution s = new Solution();

      //  s.solution(24);

        int n = 24;

        for(int i= 1; i<=n; i++) {
            if (i%2 == 0 || i%3 == 0 || i%5 == 0) {
                String str ="";
                if (i % 2 == 0)
                    str = str + "Codility";
                if (i % 3 == 0)
                    str = str + "Test";
                if (i % 5 == 0)
                    str = str + "Coders";
                System.out.println(str);
            }
            else
                System.out.println(i);
        }

    }
}
