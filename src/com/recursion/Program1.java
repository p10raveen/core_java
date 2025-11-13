package com.recursion;

import com.oop.Program5;

public class Program1 {

    static void m1(int num)
    {
        if(num>0)
        {
            System.out.println(num);
            m1(num-1);
        }
    }

    public static  void main(String[] args)
    {
        Program1.m1(5);
    }
}
