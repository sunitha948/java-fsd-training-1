class AssignmentTwo
{
	public static void main(String[] args)
	{
	String str="hello";
	try
	{
	System.out.println(str.charAt(10));
	}
	catch(StringIndexOutOfBoundsException e)
	{
	System.out.println("Array Index Out Of Bound Exception is found");
	}
	}
}