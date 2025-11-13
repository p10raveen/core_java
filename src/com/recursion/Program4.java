package com.recursion;

public class Program4 {

    static void m1(int num)
    {
        if(num>0)
        {
            m1(num-1);
            System.out.println(num);
            m1(num-1);
        }
    }

    public static  void main(String[] args)
    {
        Program4.m1(3);
    }
}
