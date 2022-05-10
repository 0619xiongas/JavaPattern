public class ConcreteObserver implements MyObserver{
    private String name;
    public ConcreteObserver (String name){
        this.name = name;
    }
    @Override
    public void response(Stock stock) {
        System.out.println("提示股民:"+name);
        System.out.println("--------股票:"+stock.getName());
        System.out.println("新价格是:"+stock.getPrice());
    }
}
