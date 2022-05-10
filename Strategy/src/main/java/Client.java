public class Client {
    public static void main(String[] args) {
        int arr[] = {3,5,2,9,6,8,7,10,23,14};
        Sorts sorts = new Sorts(arr);
        MySort maopao = new maopaoSort();
        MySort choice = new ChoiceSort();
        MySort insert = new InsertSort();

        sorts.setMySort(maopao);
        System.out.println("冒泡排序");
        sorts.execute(arr);

        sorts.setMySort(insert);
        System.out.println("\n插入排序");
        sorts.execute(arr);

        sorts.setMySort(choice);
        System.out.println("\n选择排序");
        sorts.execute(arr);
    }
}
