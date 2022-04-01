import java.lang.reflect.Array;
import java.util.Arrays;



public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        int index = binarySearch1(array, 34);

        System.out.println(index);
    }

    private static int binarySearch1(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            int middle = (high+low)/2;
            System.out.println(middle);
            int value = array[middle];
            if (target>value) low = middle+1;
            else if (target<value) high = middle-1;
            else return middle;
        }
return -1;
    }
}
