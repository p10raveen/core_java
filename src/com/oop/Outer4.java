package com.oop;

public class Outer4 {

    String name = "James";

    class Inner1
    {
        void show()
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args)
    {
        new Outer4().new Inner1().show();
    }
}
