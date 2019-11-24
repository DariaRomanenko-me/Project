package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int simple = 2;
        int count = 0;
        c: while(true) {
            for (int i = 2; i < simple; i++) {
                if (simple % i == 0) {
                    ++simple;
                    continue c;
                }
            }
            ++count;
            if(number == count) {
                break c;
            }
            ++simple;
        }
        System.out.println(simple);
    }
}

