package com.company.stream;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable(null);
        Optional<String> opt2 = Optional.ofNullable("123");

        System.out.println(opt1.isPresent());
        System.out.println(opt2.isPresent());

        Optional<String> optString = Optional.of("codestates");
        System.out.println(optString);
        System.out.println(optString.get());

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("kimcoding");
        System.out.println(name);
    }
}
