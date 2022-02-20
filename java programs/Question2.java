import java.io.*;
import java.util.*;
class Question2
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array:");
	int n=sc.nextInt();
	String[][] arr=new String[n][n];
	System.out.println("eneter the elements:");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			arr[i][j]=sc.next();
		}
	
	}
	System.out.println(" ");
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
		System.out.print(arr[i][j]+" ");
	}	
	System.out.println(" ");
	}
	System.out.println(" ");
	}
}