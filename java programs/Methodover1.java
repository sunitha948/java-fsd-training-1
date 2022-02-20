//1.Write Two program to implement Method overloading in different ways.Create atleast 4 methods in one program through which method overloading can be implemented.
 //way 1
class Methodover1
 {
  static void sum(int a,int b)
  {
   System.out.println(a+b);
  }
  static void sum(int a,int b,int c)
  {
  System.out.println(a+b+c);
  }
  static void sum(int a,int b,int c,int d)
  {
  System.out.println(a-b);
  }
  static void sum(int a,int b,int c,int d,int e)
  {
  System.out.println(a-b-d);
  }
  public static void main(String[] args)
  {
  sum(10,33);
  sum(40,22,12);
  sum(30,23,7,12);
  sum(70,23,5,87,3);
  }
 }