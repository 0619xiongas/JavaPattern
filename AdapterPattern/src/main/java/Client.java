import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int array[] = {1,5,2,4,8};
        Adapter adapter = new Adapter();
        System.out.println("未排序前数组的值为：");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] );
        }
        System.out.println();
        adapter.sort(array);
        System.out.println("快速排序后数组的值为：");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] );
        }
        System.out.println();
        System.out.println("请输入你要查找的数：");
        Scanner on = new Scanner(System.in);
        int k = on.nextInt();
        int dex = adapter.search(array,k);
        System.out.println("数字"+k+"在数组中的索引为："+dex);



    }
}
