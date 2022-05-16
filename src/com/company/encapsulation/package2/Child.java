package com.company.encapsulation.package2;

import com.company.encapsulation.package1.Parent;

public class Child extends Parent {
    public void printEach() {
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Test2 {
    public static void main(String[] args) {
        Parent p = new Parent();

//        System.out.println(p.a);
//        System.out.println(p.b);
        System.out.println(p.d);
    }
}