package com.oop;

public class Program11 {

    // Var-args parameter should be last parameter in the method
    static void visible(int... a) // int[] a
    {
        System.out.println(a.length); // 6
        System.out.println(a[0]);  // 10
        System.out.println(a[1]); // 11
        System.out.println(a[a.length-1]); // 18
    }

    public static void main(String[] args)
    {
        Program11.visible(10,11,12,15,14,18);

    }
}
