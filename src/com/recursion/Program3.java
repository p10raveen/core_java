package com.recursion;

public class Program3 {

    static void m1(int num)
    {
        if(num>0)
        {
            System.out.println(num);
            m1(num-1);
            m1(num-1);
        }
    }

    public static  void main(String[] args)
    {
        Program3.m1(3);
    }
}
