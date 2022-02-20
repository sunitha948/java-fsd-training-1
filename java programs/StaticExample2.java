class StaticExample2
{
	static int count=0;
	StaticExample2()
	{
	count++;
	System.out.println(count);
	}
	public static void main(String[] args)
	{
	StaticExample2 a=new StaticExample2();
	StaticExample2 b=new StaticExample2();
	StaticExample2 c=new StaticExample2();
	}
}//when static is given there will not be seperate count values.it will print 1,2,3.
//there is only one instance when static is given.so with respect to any object there is only one instance.