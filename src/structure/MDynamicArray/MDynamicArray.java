package structure.MDynamicArray;

public class MDynamicArray {

  public static void run(){
    System.out.println("\n==== Dynamic Arrays ====\n");

    DynamicArray dynamicArray = new DynamicArray(5);

    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");
    dynamicArray.add("D");
    dynamicArray.add("E");

    dynamicArray.insert(0, "X");

    dynamicArray.delete("A");
    dynamicArray.delete("B");
    dynamicArray.delete("C");

    System.out.println(dynamicArray);
    System.out.println("size: " + dynamicArray.size);
    System.out.println("Capacity: " + dynamicArray.capacity); 
    System.out.println("empty: " + dynamicArray.isEmpty());
    
    int indexofC = dynamicArray.search("C");
    System.out.println("Index of C: " + indexofC);

  }

}
