package structure;

import java.util.*;

public class LinkedListVsArrayList {
  public static void run() {
    System.out.println("\n==== LinkedList vs ArrayList ====\n");

    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    long startTime;
    long endTime;
    long elapsedTime;

    for(int i = 0; i < 1000000; i++) {
      linkedList.add(i);
      arrayList.add(i); 
    }

    // *************************** LinkedList ***************************

    startTime = System.nanoTime();

    // linkedList.get(0); // ~= 30500ns
    // linkedList.get(500000); // ~= 6870100ns worst possible is the middle of the linkedList
    // linkedList.get(999999); // ~= 25500ns
    // linkedList.remove(0); // ~= 35700ns
    // linkedList.remove(500000); // ~= 7416600ns
    linkedList.remove(999999); // ~= 26500ns

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("LinkedList:\t" + elapsedTime + " ns");


    // *************************** DynamicList ***************************
    startTime = System.nanoTime();

    // arrayList.get(0); // ~= 21700ns
    // arrayList.get(500000); // ~= 20800ns
    // arrayList.get(999999); // ~=20500ns
    // arrayList.remove(0); // ~= 1374100ns
    // arrayList.remove(500000); // ~= 477100ns
    arrayList.remove(999999); // ~= 21700ns

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("ArrayList:\t" + elapsedTime + " ns");
  }
}
