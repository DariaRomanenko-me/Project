package com.company;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        int a = scanner.nextInt();
        float f = 5.0f;
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b) {
            if (c < a) {
                System.out.println(b);
            } else if (c > b) {
                System.out.println(c);
            } else if (c > a && c < b) {
                System.out.println(b);
            } else if (c == a) {
                System.out.println(b);
            } else if (c == b) {
                System.out.println(b);
            }
        } else if (a == b) {
            if (c < a) {
                System.out.println(a);
            } else if (c == a) {
                System.out.println(a);
            }
        } else {
            if (c < b) {
                System.out.println(a);
            } else if (c > b && c < a) {
                System.out.println(a);
            } else if (a < c) {
                System.out.println(c);
            } else if (b == c) {
                System.out.println(a);
            } else if (a == c) {
                System.out.println(a);
            }
        }
    }
}