import java.util.*;
class PriorityQueueString
{
	public static void main(String[] args)
	{
			PriorityQueue<String> pq= new PriorityQueue<String>();	
            pq.add("HELLO");
            pq.add("HAI");
            pq.add("WELCOME");
            pq.add("HOME");
            pq.add("PARVATHY");
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