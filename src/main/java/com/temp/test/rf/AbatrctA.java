package com.temp.test.rf;

public abstract class AbatrctA implements AInterface {

    @Override
    public String getA(int b, int c) {
        before(b, "");
        return "A";
    }

    protected abstract void before(int A, String aa);

}
