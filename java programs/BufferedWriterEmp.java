import java.io.*;
class BufferedWriterEmp
{
	public static void main(String[] args)throws IOException 
	{
	FileWriter writer=new FileWriter("D:\\testout.txt");
	BufferedWriter buffer=new BufferedWriter(writer);
	buffer.write("hello Goodmorning");
	buffer.close();
	System.out.println("morning");
	}
}