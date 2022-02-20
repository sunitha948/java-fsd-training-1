
import java.util.*;
class PriorityQueueInt
{
	public static void main(String[] args)
	{
			PriorityQueue<Integer> pq= new PriorityQueue<Integer>();	
            pq.add(1);
            pq.add(2);
            pq.add(3);
            pq.add(4);
            System.out.println("PriorityQueue elements: "+ pq);
            System.out.println("head of pq-" +pq.peek());
            int size = pq.size();
            System.out.println("Size of queue-"+ size);      
            boolean removed = pq.remove(3);
            System.out.println("removed element-"+ removed);
            pq.poll();   
            System.out.println("Priority Queue is: "+ pq);
            System.out.println("Is priority queue empty? :" +pq.isEmpty());
            
                
                                          
	}
}