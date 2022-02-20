import java.lang.*;
import java.io.*;
import java.util.*;
class Question1
{
	public static void main(String[] args)
	{
	int sum=0;
	System.out.println("Enter the size of the array:");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	String[] numbers=new String[size];
	System.out.println("Enter the numbers:");
	for(int i=0;i<size;i++)
	{
	numbers[i]=sc.next();
	}
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=Integer.parseInt(numbers[i]);
	}
	for(int i=0;i<size;i++)
	{
		sum+=arr[i];
	}
	System.out.println(" ");
	System.out.println("the sum of all elements is:"+ sum);
	}
}