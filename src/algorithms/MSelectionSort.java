package algorithms;

public class MSelectionSort {
  public static void run() {
    System.out.println("\n==== Selection Sort ====\n");

    // selection sort = search through an array and keep track of the minimum value during
    //                  each iteration. At the end of each iteration, we swap variables
    //                  Quadratic time O(n^2)
    //                  small data set = Okay.
    //                  large data set = BAD.

    int array[] = {9,1,8,2,7,3,6,4,5};

    selectionSort(array);

    for(int i: array) {
      System.out.print(i);
    }
  }

  public static void selectionSort(int[] array){
    for(int i = 0; i < array.length - 1; i++){
      int min = i;
      for(int j = i+1;  j < array.length; j++) {
        if(array[j] < array[min]) {
          min = j;
        }
      }
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
    }
  }
}
