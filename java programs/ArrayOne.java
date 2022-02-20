import java.util.*;
class ArrayOne 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size:");
	int size=sc.nextInt();
	int[] arr1=new int[size];
	int[] arr2=new int[size];
	int[] sum=new int[size];

	System.out.println("Enter the elements of the array 1:");
	for(int i=0;i<size;i++)
	{
	arr1[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
	arr2[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
	sum[i]=arr1[i]+arr2[i];
	}

	System.out.println("the sum of arrays before sorting:");
	System.out.println(Arrays.toString(sum));

	for(int i=0;i<size;i++)
	{
      int min=i;
      for(int j=0;j<size-1;j++)
      {
       if(sum[min]<sum[j])
       //{
       min=j;
      // }
      }

      int temp=sum[min];
      sum[min]=sum[i];
      sum[i]=temp;
	
	}
	System.out.println();
	System.out.println("after sorting sum array is:");
	System.out.println(Arrays.toString(sum));
     
     sc.close();
	}
}