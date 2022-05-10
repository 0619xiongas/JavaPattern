/**
 * 抽象迭代器
 */

public interface Iterator {
    public void next();
    public boolean isLast();
    public void previous();
    public boolean isFirst();
    public String getNextItem();
    public String getPreviousItem();
}
