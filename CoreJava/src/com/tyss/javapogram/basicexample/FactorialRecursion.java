package com.tyss.javapogram.basicexample;

public class FactorialRecursion {
    public static void main(String[] args) {
		int num=4;
		int res=fact(num);
		System.out.println(res);
	}
    static int fact(int n)
    {
    	if(n==0)
    	{
    		return 1;
    	}
    	return n*fact(n-1);
    }
}
