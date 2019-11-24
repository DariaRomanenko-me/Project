package com.company;

public class Task2_10_xterm {
    public static void main(String[] args) throws Exception {
        int a = Xterm.inputInt();
        int b = Xterm.inputInt();
        int c = Xterm.inputInt();
        Xterm.println("" + a, Xterm.Magenta, Xterm.Blue);
        Xterm.println("" + b, Xterm.Blue, Xterm.Yellow);
        Xterm.println("" + c, Xterm.Cyan, Xterm.Green);
        int d = (a+b+c)/3;
        Xterm.println(""+ d, Xterm.Red, Xterm.Black);
    }
}