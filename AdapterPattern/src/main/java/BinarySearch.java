public class BinarySearch {
    public int binarySearch(int arr[], int val) {
        int low, mid, high;
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            mid = (high + low) / 2;
            if (val > arr[mid]) {
                low = mid + 1;
            }else if(val < arr[mid]){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
