//1.Write Two program to implement Method overloading in different ways.Create atleast 4 methods in one program through which method overloading can be implemented.
//way 2
class MethodOver2
{
  static void sum(int a,int b)
  {
   System.out.println(a+b);
  }
  static void sum(int a,double b)
  {
  System.out.println(a+b);
  }
  static void sum(double a,double b)
  {
  System.out.println(a+b);
  }
  static void sum(int a,int b,double c)
  {
  System.out.println(a+b+c);
  }
  public static void main(String[] args)
  {
  sum(10,33);
  sum(40,22.5);
  sum(30.23,7.12);
  sum(70,23,5.8);
  }
 }