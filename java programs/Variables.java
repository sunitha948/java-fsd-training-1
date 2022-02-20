//3. write a program to show the implemention of local, Instance and class variables in a single program. 

class Variables
{
int instVariable;
static int statVar=1;

public static void main(String[] args)
{
	int x=4;
	Variables obj=new Variables();
	System.out.println("The value of local variable x is "+x);
	System.out.println("The value of static variable statVar is "+statVar);
	System.out.println("the value of instance variable "+obj.instVariable);


	
}
public void display()
{
	
	System.out.println("The value of instance variable instVariable is "+instVariable);

}

}
