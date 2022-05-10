public class Sorts {
    private MySort mySort;

    private int[] arr;

    public Sorts(int[] arr) {
        this.arr = arr;
    }

    public MySort getMySort() {
        return mySort;
    }

    public void setMySort(MySort mySort) {
        this.mySort = mySort;
    }

    public Sorts(MySort mySort) {
        this.mySort = mySort;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void execute(int [] arr){
        arr = mySort.mySort(arr);
        for(int i:arr){
            System.out.print(i+"   ");
        }
    }
}
