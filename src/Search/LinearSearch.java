package Search;

public class LinearSearch {

    // Linear search - Iterate through a collection one element at a time
    // runtime complexity: O(n)


    // Disadvantages:
    // Slow for large data sets

    // Advantages:
    /* - Fast for searches at small to medium data sets
       - Does not need to be sorted
       - Useful for data structures that do not have random access (Linked List)
     */



    private static int linearSearch(int[] array, int value) {
        for (int i=0; i< array.length; i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {9,1,8,2,7,6,4,5,3};

        int index =  linearSearch(array,1);

        System.out.println(index);
    }
}