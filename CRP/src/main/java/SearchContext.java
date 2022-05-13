public abstract class SearchContext {
    protected SearchContext instance;
    public void setInstance(SearchContext instance){
        this.instance = instance;
    }
    public abstract void handleRequest(SearchKey key);
}
