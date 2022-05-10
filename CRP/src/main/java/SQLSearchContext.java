public class SQLSearchContext extends SearchContext{
    public void handleRequest(SearchKey key) {
        String key1 = "sql";
        if(key1.equals(key.getKey()))
            System.out.println("在SQLSearchContext中找到了");
        else
        if(this.instance != null) this.instance.handleRequest(key);
    }
}

