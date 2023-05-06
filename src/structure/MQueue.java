package structure;

import java.util.*;

public class MQueue {
  
  public static void run() {

		System.out.println("\n==== Queue ====\n");

    /*
     * Queue = FIFO data Structure. First-In First-Out (ex: A line of people)
     * 
     *         A collection designed for holding elements prior to processing
     *         Linear Data Structure
     * 
     *         add = enqueue, offer()
     *         remove = dequeue = poll()
     *
     */

    Queue<String> queue = new LinkedList<String>();

    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    System.out.println("First: " + queue.peek());

    System.out.println("Entire Queue: " + queue);

    queue.poll();

    System.out.println("1° queue.poll(): " + queue);

    String name = queue.poll();

    System.out.println("Who leaves the queue now: " + name);

    System.out.println(queue);

    // Validating if it's empty
    System.out.println("Is the queue empty: " + queue.isEmpty());

    // Validating the size
    System.out.println("Queue Size: " + queue.size());

    // Validating if the queue contains some person:
    System.out.println("Queue contains Kare? -> " + queue.contains("Karen"));
    System.out.println("Queue contains Harold? -> " + queue.contains("Harold"));

    /**
     * 
     * Collection.add() method is common to use to add an element into queue
     * whe error exceptions is a common thing to occur. 
     * 
     * The Collection.offer() method will offer the value to validate if it can be
     * inserted into the Queue. If it can, it's inserted, otherwise the method
     * returns false.
     * 
     * the same occurs with the following methods:
     * 
     * Remove	remove()	poll()
     * Examine	element()	peek()
     * 
     */

    //  Where are queues useful?

    // 1. Keyboard Buffer (letters should appear on the screen in order they're pressed)
    // 2. Printer Queue (Print jobs, should be completed in order)
    // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

  }

}
