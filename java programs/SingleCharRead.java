import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class SingleCharRead
{
	public static void main(String[] args)throws IOException
	{
	try
	{
	FileReader filereader=new FileReader("E:SampleData.txt");
	int data=filereader.read();
	while(data !=-1)
	{
	data=filereader.read();
	System.out.println(data);
	}
	}
	catch(FileNotFoundException e)
	{
     System.out.println("File not found");
	}
	}
}