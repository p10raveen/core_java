package com.oop;

public class Program14 {

    Program14()
    {
        System.out.println("Hello");
    }

    Program14(int a)
    {
        System.out.println("Hi");
    }

    public static void main(String[] args)
    {
        Program14 p1 = new Program14();

        Program14 p2 = new Program14(10);

    }
}
