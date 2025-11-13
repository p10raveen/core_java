package com.oop;

public class Program21 {

    String name ;

    Program21(String name)
    {
       this.name = name;
    }

    public static void main(String[] args)
    {
        Program21 p1 = new Program21("James");
        System.out.println(p1.name);
    }
}
