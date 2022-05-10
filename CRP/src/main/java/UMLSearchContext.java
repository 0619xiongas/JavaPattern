public class UMLSearchContext extends SearchContext{
    public void handleRequest(SearchKey key) {
        String key1 = "uml";
        if(key1.equals(key.getKey()))
            System.out.println("在UMLSearchContext中找到了");
        else
        if(this.instance != null) this.instance.handleRequest(key);
    }
}
