class Program4
{
	static void sample()
	{
	try
	{
	throw new
	NullPointerException("test");
	}
	catch(NullPointerException e)
	{
	System.out.println("hello world");
	throw e;
	}
	}
	public static void main(String[] args)
	{
	try
	{
	sample();
	}
	catch(NullPointerException e)
	{
		System.out.println("demo");
	}
	}
}