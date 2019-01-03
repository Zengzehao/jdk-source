package com.java.lang;

import org.junit.Test;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("kvill");
        String s2 = s1.intern();

        System.out.println(Integer.toHexString(s1.hashCode()));
        System.out.println(Integer.toHexString(s2.hashCode()));

        System.out.println(s1 == s1.intern());
        System.out.println(s1 == s2);
        System.out.println(s2 == s1.intern());
        System.out.println(s2.intern() == s1.intern());
    }
}
