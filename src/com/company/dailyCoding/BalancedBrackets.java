package com.company.dailyCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        boolean output = balancedBrackets("(");
        System.out.println(output); // // -> false

        output = balancedBrackets("()");
        System.out.println(output); // --> true

        output = balancedBrackets("[](){}");
        System.out.println(output); // --> true

        boolean output2 = balancedBrackets("[({})]");
        System.out.println(output2); // --> true

        boolean output3 = balancedBrackets("[(]{)}");
        System.out.println(output3); // --> false
    }

    public static boolean balancedBrackets(String str) {
        // TODO:
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (!map.containsKey(key)) {
                stack.push(key);
            } else if (stack.isEmpty() || map.get(key) != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
