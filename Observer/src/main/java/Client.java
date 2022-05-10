public class Client {
    public static void main(String[] args) {
        MyObserver myo1,myo2;
        myo1 = new ConcreteObserver("TangXiong");
        myo2 = new ConcreteObserver("TTTTT");
        Stock bilibili = new Stock("How",100);
        bilibili.attach(myo1);
        bilibili.attach(myo2);
        bilibili.setPrice(200);
    }
}
