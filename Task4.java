package com.company;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if(a > 1) {
            System.out.println(a - 1);
        }
        else if (a <= 1 && a >= 0) {
            System.out.println("Расстояния не существует");
        }
        else if(a < 0) {
            System.out.println(0 - a);
        }
    }
}