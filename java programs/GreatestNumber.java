//2.Write a Java Program to initalise two global static variables and to display the greatest of them.
 
import java.io.*;
class GreatestNumber
{
	public static void main(String[] args)
	{
	int a=4;
	int b=10;
    System.out.println("a="+a);
	System.out.println("b="+b);
	if(a>b)
	{
	System.out.println("a is greatest");
	}
	else
	{
	System.out.println("b is greatest");
	}
	}
}