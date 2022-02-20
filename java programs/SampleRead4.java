import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
class SampleRead4
{
	public static void main(Static[] args) throws IOException
	{
		FileReader frd=new FileReader("D:NewOutput.txt");
		BufferedReader buff=new BufferedReader(frd);
		boolean b=buff.ready();
		System.out.println("Checking reader is ready or not(true/false):"+b);

		System.out.println((char)buff.read());
	    System.out.println((char)buff.read());
	    System.out.println((char)buff.read());
	    buff.mark(0);
	    System.out.println("Mark invoked,printing after mark");
	    System.out.println((char)buff.read());
	    buff.reset();
	    System.out.println("Reset the reader");
	    System.out.println((char)buff.read());
	    System.out.println((char)buff.read());


	    buff.close();
	    frd.close();

	}
	catch(FileNotFoundException e)
	{
		System.out.println("File Not Found");
	}


}