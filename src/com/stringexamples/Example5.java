package com.stringexamples;

public class Example5 {
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "Hello";
        String c = "hello";

        System.out.println(a.equals(b));           // true
        System.out.println(a.equals(c));           // false
        System.out.println(a.equalsIgnoreCase(c)); //  true
    }
}
