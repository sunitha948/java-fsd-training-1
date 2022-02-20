import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String[] args)
	{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the term to be printed:");
	int a=1;
	int b=0;
	int ch=ob.nextInt();
	for(int i=0;i<ch;i++)
	{
		System.out.println(b);
		b=a+b;
		a=b-a;
		if(i<=ch -2)
		{
			System.out.print(" , ");
		}
		if(i==ch -1)
		{
			System.out.println(".\nThese are the first "+ ch +" Fibonacci Numbers:");
		}

	}
	}
}