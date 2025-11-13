package com.oop;

public class Program9 {

    static void visible(int... a) // Var-args method
    {
        System.out.println("Bye");
    }

    public static void main(String[] args)
    {
        Program9.visible(10,20,30,40,50);
        Program9.visible(10,20,30,40);
        Program9.visible(10,20,30);
        Program9.visible(10,20);
        Program9.visible(10);
        Program9.visible();
    }
}
