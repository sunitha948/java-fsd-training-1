import java.util.*;
class AssignmentOne
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str1=sc.nextLine();
	System.out.print("Enter the second string:");
	String str2=sc.nextLine();
	boolean result=(str1.contains(str2));
	if(result==true)
	{
	System.out.print("second string is a substring");
	}
	else
	{
	System.out.println("Second string is not substring");
	}
	
	}
}