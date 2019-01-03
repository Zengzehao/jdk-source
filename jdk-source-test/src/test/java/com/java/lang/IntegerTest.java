package com.java.lang;

import org.junit.Test;

public class IntegerTest {

    @Test
    public void testConstrcutor() {
        System.out.println(1);
        Integer a = 1;
    }

    @Test
    public void testIntegerCache() {
        Integer a = 5;
        Integer b = 5;

        System.out.println(a == b);

        Integer c = 130;
        Integer d = 130;
        System.out.println(c == d);

        Integer f = new Integer(5);
        System.out.println(a == f);

    }
}
