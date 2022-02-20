import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
class ReadMethod2
{
	public static void main(String[] args) throws IndexOutOfBoundsException
	{
		File f1=new File("E:SampleData.txt");
        int len=(int) f1.length();
        try(FileReader fr=new FileReader(f1))
        {
        	char[] c=new char[len];
        	fr.read(c);
        	String filecontent=new String(c);
        	System.out.println(filecontent);
        }
        catch(FileNotFoundException e)
        {
        	System.out.println("File not found");
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}
}