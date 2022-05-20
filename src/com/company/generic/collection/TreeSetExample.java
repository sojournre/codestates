package com.company.generic.collection;

import javax.sql.rowset.WebRowSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> workers = new TreeSet<>();

        workers.add("lee java");
        workers.add("park hacker");
        workers.add("kim coding");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("k"));
        System.out.println(workers.subSet("kim", "x"));
    }
}
