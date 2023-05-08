package algorithms;

public class MBinarySearch {

  public static void run() {
    System.out.println("\n==== Binary Search ====\n");

    int array[] = new int[1000000];
    int target = 777777;

    for(int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }

    long startTime, endTime, elapsedTime;

    startTime = System.nanoTime();
    // Java includes your own binarySearch as method of the Arrays class
    // int index = Arrays.binarySearch(array, target);
    int index = MyBinarySearch(array, target);

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("Elapsed Time (Binary Search): " + elapsedTime + " ns");

    if(index == -1) {
      System.out.println(target + " not found");
    }else {
      System.out.println("Element found at: " + index);
    }
  }

  public static int MyBinarySearch(int[] list, int item) {
    int low = 0;
    int high = list.length - 1;

    while(low <= high) {
      int middle =  (low + high) / 2;
      int guess = list[middle];

      if(guess == item) {
        return middle;
      } else if(guess > item) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
    }
    return -1;
  }
}