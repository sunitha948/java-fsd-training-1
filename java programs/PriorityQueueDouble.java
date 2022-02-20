import java.util.*;
class PriorityQueueDouble
{
	public static void main(String[] args)
	{
			PriorityQueue<Double> pq= new PriorityQueue<Double>();	
            pq.add(10.11);
            pq.add(20.222);
            pq.add(30.3);
            pq.add(40.4444);
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