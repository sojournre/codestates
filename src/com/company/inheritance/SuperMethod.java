package com.company.inheritance;

public class SuperMethod {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Human {
    Human() {
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human {
    Student() {
//        super();
//        this();
        System.out.println("학생 클래스 생성자");
    }
}