import java.util.*;
class PriorityQueueCharacter
{
	public static void main(String[] args)
	{
			PriorityQueue<Character> pq= new PriorityQueue<Character>();	
            pq.add('H');
            pq.add('E');
            pq.add('L');
            pq.add('O');
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