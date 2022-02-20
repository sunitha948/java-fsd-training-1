class QuestionTwo
{
	static void resultCheck(int marks)
	{
	if(marks<45)
	{
	throw new ArithmeticException("sorry,you failed");
	}
	else
	{
	System.out.println("congrats,you passed!");
	}
	}
	public static void main(String[] args)
	{
	resultCheck(40);
	}
}