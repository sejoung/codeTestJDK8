package com.github.sejoung.codetest.mutability;

// 코드 17-1 불변 복소수 클래스 (106-107쪽)
public final class Complex {
    private final double realNumber;
    private final double imaginaryNumber;

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    public Complex(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public double realPart() {
   
        return realNumber;
    }

    public double imaginaryPart() {
        return imaginaryNumber;
    }

    public Complex plus(Complex c) {
        return new Complex(realNumber + c.realNumber, imaginaryNumber + c.imaginaryNumber);
    }

    // 코드 17-2 정적 팩터리(private 생성자와 함께 사용해야 한다.) (110-111쪽)
    public static Complex valueOf(double realNumber, double imaginaryNumber) {
        return new Complex(realNumber, imaginaryNumber);
    }

    public Complex minus(Complex c) {
        return new Complex(realNumber - c.realNumber, imaginaryNumber - c.imaginaryNumber);
    }

    public Complex times(Complex c) {
        return new Complex(realNumber * c.realNumber - imaginaryNumber * c.imaginaryNumber,
                realNumber * c.imaginaryNumber + imaginaryNumber * c.realNumber);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.realNumber * c.realNumber + c.imaginaryNumber * c.imaginaryNumber;
        return new Complex((realNumber * c.realNumber + imaginaryNumber * c.imaginaryNumber) / tmp,
                (imaginaryNumber * c.realNumber - realNumber * c.imaginaryNumber) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;

        // == 대신 compare를 사용하는 이유는 63쪽을 확인하라.
        return Double.compare(c.realNumber, realNumber) == 0
                && Double.compare(c.imaginaryNumber, imaginaryNumber) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(realNumber) + Double.hashCode(imaginaryNumber);
    }

    @Override
    public String toString() {
        return "(" + realNumber + " + " + imaginaryNumber + "i)";
    }
}
