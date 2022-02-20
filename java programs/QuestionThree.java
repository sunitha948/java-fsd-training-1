//create two arraylist of strings to take Fisrt_name and Last_name of the students,and print their whole name.
import java.util.*;
class QuestionThree
{
	public static void main(String[] args)
	{
	ArrayList<String> First_name=new ArrayList<String>();
	ArrayList<String> Last_name=new ArrayList<String>();
	ArrayList<String> Full_name=new ArrayList<String>();
	First_name.add("Freya");
	First_name.add("Anjuna");
	First_name.add("Athulya");
	Last_name.add("George");
	Last_name.add("Babu");
	Last_name.add("P");
	for(int i=0;i<First_name.size();i++)
	{
	Full_name.add(First_name.get(i)+" "+Last_name.get(i));
	}
	System.out.println("Full_name:");
	System.out.println();
	for(String i:Full_name)
	{
	System.out.println(i);
	}
	}
}