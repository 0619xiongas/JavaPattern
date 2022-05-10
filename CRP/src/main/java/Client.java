public class Client {
    public static void main(String[] args) {
        SearchContext objJava,objSQL,objUML;

        objJava = new JavaSearchContext();
        objSQL = new SQLSearchContext();
        objUML = new UMLSearchContext();

        objJava.setInstance(objSQL);
        objSQL.setInstance(objUML);

        SearchKey key1 = new SearchKey("java");
        objJava.handleRequest(key1);

        SearchKey key2 = new SearchKey("sql");
        objSQL.handleRequest(key2);

        SearchKey key3 = new SearchKey("uml");
        objUML.handleRequest(key3);
    }
}
