import java.io.FileWriter;
import java.io.IOException;
class SampleCreate
{
	public static void main(String[] args)throws IOException
	{
	String st="this is just some sample content"+" for writing into a file";
	FileWriter f=new FileWriter("E:SampleOutputWriter.txt");
	for(int i=0;i<st.length();i++)
	{
	 f.write(st.charAt(i));
	}
	System.out.println("Finished writing");
	f.close();
	}
}