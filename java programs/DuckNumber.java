import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int num=sc.nextInt();
	int c=0;
	int r;
	while(num!=0)
	{
	r=num%10;
	if(r==0)
	c++;
	num=num/10;
	}
	if(c>0)
	{
	System.out.println("Duck number");
    }
	else
	{
	System.out.println("Not duck number");
	}
	

	}
}
