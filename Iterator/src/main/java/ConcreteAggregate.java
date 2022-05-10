/**
 * 具体聚合类
 */
public class ConcreteAggregate extends Aggregate{

    public ConcreteAggregate(String[] CommodityName) {
        super(CommodityName);
    }
    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(this);
    }
}
