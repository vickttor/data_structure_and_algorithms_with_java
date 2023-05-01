package structure;

import java.util.*;

public class MPriorityQueue {
  
  public static void run() {

    System.out.println("\n==== Queue ====\n");

    /**
     * Priority Queue = A FIFO data Structure that serves elements
     *                  with the highst priorities first before elements
     *                  with lower priority
     */

    Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());

    queue1.offer(3.0);
    queue1.offer(2.5);
    queue1.offer(4.0);
    queue1.offer(1.5);
    queue1.offer(2.0);

    while(!queue1.isEmpty()) {
      System.out.println(queue1.poll());
    }

    System.out.println("\n Priority Queues with Strings");

    Queue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder());

    queue2.offer("B");
    queue2.offer("C");
    queue2.offer("A");
    queue2.offer("E");
    queue2.offer("D");

    while(!queue2.isEmpty()) {
      System.out.println(queue2.poll());
    }



  }

}
