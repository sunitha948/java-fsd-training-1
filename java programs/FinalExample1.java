class FinalExample1
{
	final int a=5;
	void test()
	{
	a=350;
	System.out.println("a value after changing is"+a);
	}
	public static void main(String[] args)
	{
	FinalExample1 a=new FinalExample1();
	System.out.println("a="+a);
	a.test();
	}
}// there will be error because when we give final keyword it will be a constant.so trying to change the value of constant will give an error.