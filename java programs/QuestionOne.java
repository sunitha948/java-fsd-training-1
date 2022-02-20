class QuestionOne
{
	public static void main(String[] args)
	{
	try
	{
	int a=10*2;
	System.out.println(a);
	}
	catch(NullPointerException e)
	{
	System.out.println(e);
	}
	finally
	{
	System.out.println("finally block is always executed");
	}
	String b="hello";
	System.out.println(b);
	}
}