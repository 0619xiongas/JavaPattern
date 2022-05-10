public class Client {
    public static void main(String[] args) {
        Iterator iterator;
        Aggregate aggregate;
        String[] commodity = {"商品1","商品2","商品3","商品4","商品5","商品6"};
        aggregate = new ConcreteAggregate(commodity);
        iterator = aggregate.getIterator();
        System.out.println("正序：");
        while(!iterator.isLast()){
            System.out.print(iterator.getNextItem()+"     ");
            iterator.next();
        }
        System.out.println();
        System.out.println("反序：");
        while(!iterator.isFirst()){
            System.out.print(iterator.getPreviousItem()+"    ");
            iterator.previous();
        }
    }
}
