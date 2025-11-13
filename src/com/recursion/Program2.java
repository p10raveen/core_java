package com.recursion;

public class Program2 {

    static void m1(int num)
    {
        if(num>0)
        {
            m1(num-1);
            System.out.println(num);
        }
    }

    public static  void main(String[] args)
    {
        Program2.m1(5);
    }
}
