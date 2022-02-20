import java.util.*;
class UserDefined extends Exception
{
	String str;
	UserDefined(String str)
	{
	this.str=str;
	}
	public String toString()
	{
	return str;
	}
}
public class Pgm3
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=sc.nextInt();
	try
	{
	if(a<0)
	{
	throw new UserDefined("invalid number");
	}
	System.out.println("accepted");
	}
	catch(UserDefined e)
	{
	System.out.println(e);
	}
	}
}
