import java.util.ArrayList;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(20);
        dynamicArray.add("A");
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(0,1);
        dynamicArray.delete("A");

        System.out.println(dynamicArray.search("C"));
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.capacity);

//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        System.out.println(arr);
//        for (int i = 0; i < 10; i++) {
//            arr.add(i);
//        }
//        arr.add(5);
//        //arr.get(13);
//
//
//        System.out.println(arr);
    }
}
