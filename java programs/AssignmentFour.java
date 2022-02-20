import java.util.*;
class AssignmentFour
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the string:");
	String str=sc.nextLine();
	System.out.println("Enter the character:");
	char c=sc.next().charAt(0);
	int count=0;
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)==c)
	{
	count++;
	}
	}
	System.out.println(c+" is presnt in the string "+count+" times");

}	
}