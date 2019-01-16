package com.java.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest {
    @Test
    public void testForEach() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer integer : list) {
            System.out.println(integer);
            if ( integer == 1) {
                list.remove(integer);
            }
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
            if (next == 1) {
                list.remove(next);
            }
        }

        Iterator<Integer> iterator1 = list.iterator();
//        list.add(6);
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            System.out.println(next);
            iterator1.remove();
        }


    }
}
