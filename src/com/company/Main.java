package com.company;

import java.util.Scanner;

public class Main {
    static Scanner myInput = new Scanner(System.in);
    public static void main(String[] args){
        Outer : for(int i = 3; i < 10; i++){
            for(int j = 5; j > 0; j--){
                System.out.println("i " + i + " j "+ j);
                if(i == 5){
                    break Outer;
                }
            }
        }
    }
}