import java.util.*;
class Question3
{
	public static void main(String[] args)
	{
		System.out.println("enter the no  of characters in the array:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("enter the characters of the array:");
		char[] c=new char[num];
		for(int i=0;i<num;i++)
		{
			c[i]=sc.next().charAt(0);
			
		}
		System.out.print("the character array is");
		for(int i=0;i<num;i++)
		{
			int ascii=c[i];
			System.out.print(ascii+",");
		}
		
	}
}