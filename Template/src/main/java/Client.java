public class Client {
    public static void main(String[] args) {
        DB mysql = new MysqlDB();
        mysql.execute();

        DB oracle = new OracleDB();
        oracle.execute();

    }
}
