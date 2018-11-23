package com.github.sejoung.codetest.tryfinally;

public class MyResource implements AutoCloseable {

    public void doSomething() throws FirstException{
        throw new FirstException();
    }

    @Override
    public void close() {
        System.out.printf("정상 close");
        throw new SecondException();
    }
}
