package com.stringexamples;

public class Example9 {
    public static void main(String[] args)
    {
        String a = "this is a test string";
        String[] r = a.split("i"); // r = ["th","s ","s a test str","ng"]

        System.out.println(r[0]);          // th
        System.out.println(r[r.length-1]); // ng
    }
}
