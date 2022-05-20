package com.company.generic;

class  TestClass {
    public <T> T accept(T t) {
        return t;
    }
    public <K, V> void getPrint(K k, V v) {
        System.out.println(k + ":" + v);
    }

    public <T> void print(T t) {
        System.out.println(t.equals("Kim coding"));
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        String str1 = testClass.<String>accept("Kim Coding");
        String str2 = testClass.accept("Kim Coding");
        System.out.println(str1);
        System.out.println(str2);

        testClass.<String, Integer>getPrint("Kim Coding", 1);
        testClass.getPrint("Kim Coding", 2);
    }
}
