package JiSuan;

public class Caculator {
    private int total;

    public Caculator() {

        this.total = 0;
    }

    public void Operation(int num) {
        total += num;
        System.out.println("结果为：" + total);
    }
}