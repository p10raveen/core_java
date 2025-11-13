package com.oop;

public class Outer6 {

    String name = "James";

    class Inner1
    {
        String name = "Peter";

        void show()
        {
            System.out.println(Outer6.this.name); // James
        }
    }

    public static void main(String[] args)
    {
        new Outer6().new Inner1().show();
    }
}
