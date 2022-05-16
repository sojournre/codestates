package com.company;

public class Test {
    public static void main(String[] args) {
        Example example = new Example();
        Example example1 = new Example(5);

        System.out.println("example1 = " + example1);
    }
}

class Example {
    public Example() {
        System.out.println("Example의 기본 생성자 호출!");
    };

    public Example(int x) {
        this();
        System.out.println("Example의 두 번째 생성자 호출!");
    }
}

class ClassVariable {
    int instanceVariable; // 인스턴스 변수
    static int classVariable; // 클래스 변수(static 변수)

    void method() {
        int localVariable = 0; // 지역 변수. {}블록 안에서만 유효
    }
}