import java.text.SimpleDateFormat;
import java.util.Date;

public class LogProxy implements AbstractLog{
    private AbstractLog logRecord = new LogRecord();
    @Override
    public void method(){
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = SDF.format(new Date());
        System.out.println("方法Method被调用，调用时间为："+time);
        try{
            logRecord.method();
            System.out.println("方法method()调用成功");
        }catch (Exception e){
            System.out.println("方法method()调用失败");
        }
    }
}
