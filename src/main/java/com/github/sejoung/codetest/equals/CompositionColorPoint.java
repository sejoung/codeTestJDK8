package com.github.sejoung.codetest.equals;

import java.util.Objects;

public class CompositionColorPoint {
    private final Point point;
    private final Color color;

    public CompositionColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    /**
     * 이 ColorPoint의 Point 뷰를 반환한다.
     */
    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CompositionColorPoint))
            return false;
        CompositionColorPoint cp = (CompositionColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    @Override
    public int hashCode() {
        return 31 * point.hashCode();
    }

    public static void main(String[] args) {

        CompositionColorPoint cp = new CompositionColorPoint(1, 2, Color.RED);
        CompositionColorPoint p1 = new CompositionColorPoint(1, 2, Color.RED);

        System.out.println(p1.equals(cp) + " " + cp.equals(p1));

        Point p2 = new Point(1, 2);
        Point p3 = p1.asPoint();

        System.out.println(p2.equals(p3) + " " + p3.equals(p2));
        System.out.println(p1.equals(p2) + " " + p2.equals(p1));


    }


}
