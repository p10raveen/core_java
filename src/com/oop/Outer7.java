package com.oop;
// Member Inner class
public class Outer7 {

    void show()
    {
        class Inner7
        {
            void display()
            {
                System.out.println("Hello");
            }
        }
        Inner7 obj2 = new Inner7();
        obj2.display();
    }

    public static void main(String[] args)
    {
        Outer7 obj1 = new Outer7();
        obj1.show();
    }
}
