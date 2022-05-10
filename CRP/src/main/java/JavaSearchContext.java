public class JavaSearchContext extends SearchContext{
    public void handleRequest(SearchKey key) {
        String key1 = "java";
        if(key1.equals(key.getKey()))
            System.out.println("在JavaSearchContext中找到了");
        else
        if(this.instance != null) this.instance.handleRequest(key);
    }
}