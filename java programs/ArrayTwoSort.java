import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ArrayTwoSort
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size:");
	int size=sc.nextInt();
	int[] arr1=new int[size];
	int[] arr2=new int[size];
	ArrayList<Integer> arr3=new ArrayList<Integer>();

	System.out.println("Enter the elements of the array 1:");
	for (int i=0;i<size;i++)
	{
	arr1[i]=sc.nextInt();
	}
	System.out.println("Enter the elements of the array2:");
	for (int i=0;i<size;i++)
	{
	arr2[i]=sc.nextInt();
	}
	for (int i=0;i<size;i++)
	{
	for (int j=0;j<size;j++)
	{
	if(arr[i]==arr2[j])
	{
	arr3.add(arr1[i]);
	break;
	}
	}

	}

	int len=arr3.size();
	Integer[] res=new Integer[len];
	res=arr3.toArray(res);
	System.out.println();
	System.out.println("the resultant array before sorting:");
	System.out.println(Arrays.toString(res));
	for (int i=0;i<len-1;i++)
	{
	for (int j=0;j<len-1;j++)
	{
	if(res[j]>res[j+1])
	{
	int temp=res[j];
	res[j]=res[j+1];
	res[j+1]=temp;

	}
	}
	}
     System.out.println();
     System.out.println("After sortong:");
     System.out.println(Arrays.toString(res));
     sc.close();




	}
}