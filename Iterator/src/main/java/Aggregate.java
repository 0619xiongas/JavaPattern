/**
 * 抽象聚合类 接口
 */
public abstract class Aggregate {
    private String[] CommodityName; // 商品

    public Aggregate(String[] CommodityName){
        this.CommodityName = CommodityName;
    }

    public String[] getCommodityName() {
        return CommodityName;
    }
    public abstract Iterator getIterator();
}
