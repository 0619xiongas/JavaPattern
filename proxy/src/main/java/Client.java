public class Client {
    public static void main(String[] args) {
        AbstractLog al;
        al = new LogProxy();
        al.method();
    }
}

