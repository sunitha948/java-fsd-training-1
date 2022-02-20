// Java program for implementation of Selection Sort
class SelectionSort
{
	void sort(int arr[])
	{  					
		int n = arr.length; 
		                                                    //{25,64,12,22,11} n=5

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)  
		                                                      //n-1=4
		{
			// Find the minimum element in unsorted array
			int min_idx = i;                 //min=0
			for (int j = i+1; j < n; j++)    //j=0+1=1 
				{
				if (arr[j] < arr[min_idx])
					min_idx = j;            //min=1
			}

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];  //temp=1
			arr[min_idx] = arr[i];     //arr[min]=0
			arr[i] = temp;            //arr[0]=1
		}
	}

	// Prints the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}

