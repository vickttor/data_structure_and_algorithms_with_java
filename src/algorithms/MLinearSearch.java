package algorithms;

public class MLinearSearch {

  public static void run (){
    System.out.println("\n==== Linear Search ====\n");


    int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    int searchNumber = 7;

    int index = linearSearch(array, searchNumber);

    System.out.println("Index of " + searchNumber + " -> " + index);

  }

  private static int linearSearch(int[] array, int value) {
    for(int i = 0; i < array.length; i++){
      if(array[i] == value) {
        return i;
      }
    }
    return - 1;
  }
}
