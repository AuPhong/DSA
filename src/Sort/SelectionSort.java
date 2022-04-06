package Sort;

public class SelectionSort {
    /* Selection Sort = search through an array and keep track of the minium value during
                        each iteration. At the end of each iteration, we swap variable.

                        Quadratic time O(n^2)
                        small data set = okay
                        large data set = bad
     */

    public static void main(String[] args) {
        int[] arr = {8,7,9,2,3,1,5,4,6};

        selectionSort(arr);

        for (int element:arr) {
            System.out.print(element);
        }

    }

    private static void selectionSort(int[] arr) {

//        for (int i = 0; i < arr.length-1; i++) {
//            int min = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[min]>arr[j]){
//                    min = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }

        for (int i=0; i<arr.length-1; i++){
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
