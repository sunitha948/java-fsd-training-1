class FinalExample3
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
class sample extends FinalExample3
{
	void run()
	{
	System.out.println("run method is in sample");
	}

}//here this will be overriden since final keyword is not used.