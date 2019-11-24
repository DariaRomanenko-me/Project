package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a < b){
            if(c < a){
                System.out.println(a);
            }
            else if(c > b) {
                System.out.println(b);
            }
            else if(c > a && c < b) {
                System.out.println(c);
            }
            else if(c == a) {
                System.out.println(c);
            }
            else if(c == b) {
                System.out.println(a);
            }
        }
        else if(a == b){
            if(c < a) {
                System.out.println(c);
            }
            else if(c == a) {
                System.out.println("Второго по величине нет");
            }
            else {
                System.out.println(a);
            }
        }
        else {
            if(c < b) {
                System.out.println(b);
            }
            else if(c > b && c < a) {
                System.out.println(c);
            }
            else if(a < c) {
                System.out.println(a);
            }
            else if(b == c) {
                System.out.println(c);
            }
            else if(a == c) {
                System.out.println(b);
            }
        }

    }
}
