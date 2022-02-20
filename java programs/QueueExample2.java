import java.util.LinkedList;
import java.util.Queue;

class QueueExample2
{
	public static void main(String[] args)
	{
			Queue<Integer> q1= new LinkedList<>();	
            
            for (int i = 0; i < 5; i++)
            	q1.add(i);    
            System.out.println("Elements of queue 1 "+ q1); 
                           
            int removedele = q1.remove();
            System.out.println("removed element-"+ removedele);                
            System.out.println(q1);
            int head = q1.peek();
            System.out.println("head of q1-" +head);
            int size = q1.size();
            System.out.println("Size of queue-"+ size);
            q1.clear();
            boolean Result=q1.isEmpty();
            System.out.println(Result);
            q1.add(3);
            q1.add(4);
            System.out.println("New elements of queue1 :"+q1);
            Queue<Integer> q2= new LinkedList<>();
            for (int i = 5; i < 11; i++)
                q2.add(i); 
            System.out.println("The elements of queue 2: "+q2);
            q1.addAll(q2);
            System.out.println("The new queue is: "+q1);


                           
                                          
	}
}