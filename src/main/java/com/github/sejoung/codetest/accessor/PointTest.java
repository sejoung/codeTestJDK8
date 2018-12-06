package com.github.sejoung.codetest.accessor;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(10,9);
        p.setX(1);
        p.setY(2);
        System.out.println(p.getX()+" "+p.getY());

    }
}
