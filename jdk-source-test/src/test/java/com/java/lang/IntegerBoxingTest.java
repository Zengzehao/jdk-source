package com.java.lang;

public class IntegerBoxingTest {
    public static void main(String[] args) {
        Integer i = 1; // 自动装箱时，会调用Integer.valueOf()

        int n = i; // 自动拆箱时，会调用Integer.intValue()

        //下面是反编译后的代码
        /*public class com.java.lang.IntegerBoxingTest {
            public com.java.lang.IntegerBoxingTest();
                Code:
                0: aload_0
                1: invokespecial #1                  // Method java/lang/Object."<init>":()V
                4: return

            public static void main(java.lang.String[]);
                Code:
                0: iconst_1
                1: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                4: astore_1
                5: aload_1
                6: invokevirtual #3                  // Method java/lang/Integer.intValue:()I
                9: istore_2
                10: return
        }*/
    }
}
