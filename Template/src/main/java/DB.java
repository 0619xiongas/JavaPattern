public abstract class DB {
    public abstract void connDB();

    public void OpenDB(){
        System.out.println("打开数据库！");
    }

    public void useDB(){
        System.out.println("使用数据库！");
    }

    public void closeDB(){
        System.out.println("关闭数据库！");
    }

    public void execute(){
        connDB();
        OpenDB();
        useDB();
        closeDB();
    }
}
