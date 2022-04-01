public class BubbleSort {
    /* bubble sort = pairs of adjacent elements are compared,
                     and the elements swapped if they are not in order

                     Quadratic time O(n^2)
                     small data set: okay -ish
                     large data set: bad
     */

    public static void main(String[] args) {
        int[] arr = {9,1,8,2,7,3,6,4,5};

        bubbleSort(arr);

        for (int element:arr) {
            System.out.print(element);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
