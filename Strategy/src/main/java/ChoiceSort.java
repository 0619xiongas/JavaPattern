public class ChoiceSort implements MySort {
    @Override
    public int[] mySort(int[] arr) {
        int minindex = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            minindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minindex]>arr[j]){
                    temp = arr[minindex];
                    arr[minindex] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
