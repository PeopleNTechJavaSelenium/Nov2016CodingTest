import java.util.PriorityQueue;


public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
        // queue of capacity 11
        PriorityQueue< Double > queue = new PriorityQueue< Double >();

        // insert elements to queue
        queue.offer(5.5 );
        queue.offer(6.9 );
        queue.offer(9.6 );

        System.out.print("Polling from queue: ");

        // display elements in queue
        while ( queue.size() > 0 )
        {
            System.out.printf( "%.1f ", queue.peek() );
            queue.poll();
        }


	}

}
