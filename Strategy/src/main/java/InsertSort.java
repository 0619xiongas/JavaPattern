public class InsertSort implements MySort{
    @Override
    public int[] mySort(int[] arr) {
        int temp = 0;
        int i,j;
        for(i=0;i<arr.length;i++){
            temp = arr[i];
            for(j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
