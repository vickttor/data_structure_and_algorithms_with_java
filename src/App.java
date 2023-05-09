import algorithms.*;
import structure.*;
import structure.MDynamicArray.*;

public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.println("Learning Data Structure & Algorithms with Java");
        
        // Learning Stack
        MStack.run();

        // Learning Queues
        MQueue.run();
        MPriorityQueue.run();

        // Learning LinkedLists
        MLinkedList.run();

        // Dynamic Arrays
        MDynamicArray.run();

        // Dynamic Arrays vs LinkedLists
        LinkedListVsArrayList.run();

        // Linear Search (Algorithm)
        MLinearSearch.run();

        // Binary Searach (Algorithm)
        MBinarySearch.run();

        // Interpolation Search (Algorithm)
        MInterpolationSearch.run();

    }
}
