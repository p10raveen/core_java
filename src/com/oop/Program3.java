package com.oop;

public class Program3 {

    void show()
    {
        System.out.println("hi");
    }

    static void display()
    {
        System.out.println("hello"); //2
    }

    public static void main(String[] args)
    {
        System.out.println("bye"); //1
        Program3.display();
    }
}
