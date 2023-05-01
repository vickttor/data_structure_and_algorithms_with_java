package structure;

import java.util.*;

public class MLinkedList {
  
  public static void run() {

    System.out.println("\n==== Linked List ====\n");

    /**
     * LinkedList = stores Nodes in 2 parts (data + address)
     *              Nodes are in non-consecutive memory locations
     *              elements are linked using pointers
     * 
      *      Singly Linked List
      * 
      *           Node                Node                Node
      *      [data | address] -> [data | address] -> [data | address]
      * 
      *      Doubly Linked List
      * 
      * 
      *                 Node                          Node                          Node
      *      [address | data | address] -> [address | data | address] -> [address | data | address]
     * 
     * 
     *       Advantages ?
     *       1. Dynamic Data Structure (allocates needed memory while running)
     *       2. Insertion and deletion of nodes is easy. O(1)
     *       3. No/Low Memory waste
     * 
     *       Disadvantages ?
     *       1. Greater memory usage (additional pointer)
     *       2. No random access of elements (no index [i])
     *       3. Accessing /searching elements is more time consuming O(n)
     * 
     *       uses ?
     *       1. implement Stacks/queues
     *       2. GPS navigation
     *       3. Music playlist
     * 
     */


    LinkedList<String> linkedList = new LinkedList<String>();

    // linkedList.push("A");
    // linkedList.push("B");
    // linkedList.push("C");
    // linkedList.push("D");
    // linkedList.push("E");

    // linkedList.pop();

    linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    linkedList.offer("F");
    // linkedList.poll();

    linkedList.add(4, "E");

    System.out.println(linkedList);

    linkedList.remove("E");

    System.out.println(linkedList);

    // Searching element

    System.out.println("Index Of F: " + linkedList.indexOf("F"));
    
    linkedList.addFirst("0");
    linkedList.addLast("G");

    linkedList.removeFirst();
    linkedList.removeLast();
    
    System.out.println("Peek First: " + linkedList.peekFirst());
    System.out.println("Peek Last: " + linkedList.peekLast());

    



  }
}
