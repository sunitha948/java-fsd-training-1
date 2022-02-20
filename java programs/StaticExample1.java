class StaticExample1
{
	int count=0;
	StaticExample1()
	{
	count++;
	System.out.println(count);
	}
	public static void main(String[] args)
	{
	StaticExample1 a=new StaticExample1();
	StaticExample1 b=new StaticExample1();
	StaticExample1 c=new StaticExample1();
	}
}// the value of count with respect to each object is 0.so the  op will be 1,1,1.