package algorithms;

public class MBubbleSort {
  public static void run(){
    System.out.println("\n==== Bubble Sort ====\n");

    // bubble sort = pairs of adjacent elements are compared, and the elements
    //               swapped if they are not in order.
    //               Quadratic time O(n^2)
    //               Small data set = okay
    //               large data set = BAD

    int array[] = {9,1,8,2,7,3,6,4,5};

    bubbleSort(array);

    for(int i: array) {
      System.out.println(i);
    }
  }

  private static void bubbleSort(int array[]) {
    for(int i = 0; i < array.length - 1; i++) {
      for(int j = 0; j < array.length - i - 1; j++) {
        if(array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
  }
}
