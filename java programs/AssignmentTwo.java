import java.util.*;
class AssignmentTwo
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of the array:");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.print("Enter the array elements:");
	for(int i=0;i<size;i++)
	{
	arr[i]=sc.nextInt();
	}
	System.out.print("The array elements are:");
	for(int i=0;i<size;i++)
	{
	System.out.print(arr[i]+",");
	}
	System.out.println(" ");
	int greatest=0;
	for(int i=0;i<size;i++)
	{
	if(arr[i]>greatest)
	{
	greatest=arr[i];
	}
	}
	System.out.println("The greatest element is"+greatest);
	}
}