package com.recursion;

public class Program5 {

    static void m1(int num)
    {
        if(num>0)
        {
            m1(num-1);
            m1(num-1);
            System.out.println(num);
        }
    }

    public static  void main(String[] args)
    {
        Program5.m1(3);
    }
}
