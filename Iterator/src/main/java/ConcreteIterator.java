/**
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator{
    private String[] CommodityName;
    private int index1;
    private int index2;
    public ConcreteIterator(Aggregate agg){
        CommodityName = agg.getCommodityName();
        index1 = 0;
        index2 = CommodityName.length-1;
    }
    @Override
    public void next() {
        if(index1 < CommodityName.length){
            index1++;
        }
    }

    @Override
    public boolean isLast() {
        return index1  == CommodityName.length;
    }

    @Override
    public void previous() {
        if(index2>-1){
            index2--;
        }
    }

    @Override
    public boolean isFirst() {
       return index2 == -1;
    }

    @Override
    public String getNextItem() {
       return CommodityName[index1];
    }

    @Override
    public String getPreviousItem() {
        return CommodityName[index2];
    }
}
