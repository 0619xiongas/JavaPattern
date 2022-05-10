public class Adapter implements DataOperation{
    QuickSort qs = new QuickSort();
    BinarySearch bs = new BinarySearch();

    @Override
    public void sort(int arr[]){
        qs.quickSort(arr);
    }

    @Override
    public int search(int arr[],int val){
        return  bs.binarySearch(arr,val);
    }
}
