//1.Write a Java Program to initalise two variables and perform all the Arithmetic operations on them and dsiplay their result.

import java.io.*;
import java.util.Scanner;

class Arithmetic
{
	public static void main(String[] args)
	{
	int a,b,sum,diff,product,quo;
	System.out.println("Enter the value of a and b");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	sum=a+b;
	System.out.println("the sum is "+sum);
	diff=a-b;
	System.out.println("the difference is "+diff);
	product=a*b;
	System.out.println("the product is "+product);
    quo=a/b;
    System.out.println("the quotient is "+quo);
    }  
}