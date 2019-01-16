package com.java.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class AbstractListTest {
    @Test
    public void testModCount() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
            if (integer == 10) {
//                list.remove(integer);   //注意这个地方
                iterator.remove();
            }

        }

        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            System.out.println(next);
        }


    }
}
