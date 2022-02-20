class Example2
{
	final void test()
	{
	System.out.println("test method is in Example2 class");
	}

}
class FinalExample2 extends Example2
{
	void test()
	{
	System.out.println("test method is in FinalExample2");
	}
	public static void main(String[] args)
	{
	FinalExample2 a=new FinalExample2();
	a.test();
	}
}