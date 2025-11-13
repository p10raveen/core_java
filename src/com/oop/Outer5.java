package com.oop;

public class Outer5 {

    String name = "James";

    class Inner1
    {
        String name = "Peter";

        void show()
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args)
    {
        new Outer5().new Inner1().show();
    }
}
