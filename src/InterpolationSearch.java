public class InterpolationSearch {

    /*
    interpolation search = improvement over binary search best used for "uniformly" distributed data "guess" where value might be based on calculated probe results
    If probe is incorrect, search area is narrowed, and a new probe is calculated
    average case: O(log(log(n)))
    worst case: O(n) [values increase exponentially]
     */
    public static void main(String[] args) {
        int[] arr = {1, 500, 501, 509, 1000, 7834784,88888888};
        int index = interpolationSearch(arr, 509);
        System.out.println(index);
    }


    private static int interpolationSearch(int[] arr, int value) {
        int high = arr.length - 1;
        int low = 0;

        while (value >= arr[low] && value <= arr[high] && low <= high) {
            int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
            System.out.println("probe=  " + probe);
            //System.out.println("check ---> "+(arr[probe] == value));
            if (arr[probe] == value) {
                return probe;
            } else if (value >= arr[probe]) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
       return  -1;
    }
}