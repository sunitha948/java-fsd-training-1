//write a pgm to create an arraylist of double element and add the elements.sort the elements in descending order and print it.
import java.util.*;
class QuestionOne
{
	public static void main(String[] args)
	{
     ArrayList<Double> sample=new ArrayList<Double>();
     sample.add(3.3);
     sample.add(3.33);
     sample.add(3.333);
     sample.add(3.3333);
      sample.add(3.33333);
     System.out.println(sample);
     System.out.println();
     System.out.println("After sorting in descending order:");
     Collections.sort(sample);
     System.out.println(sample);

	}
}