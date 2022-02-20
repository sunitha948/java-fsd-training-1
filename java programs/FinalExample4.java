final class FinalExample4
{
	void run()
	{
	System.out.println("run method is in FinalExample3");
	}
	public static void main(String[] args)
	{
	sample a=new sample();
	a.run();
	}
}
class sample extends FinalExample4
{
	void run()
	{
	System.out.println("run method is in sample");
	}

}//cannot be inherited since final keyword is used.final classes cannot be inherited.