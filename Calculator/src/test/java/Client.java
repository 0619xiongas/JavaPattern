import Operations.Operation;
import utils.XMLUtil;

public class Client {
    public static void main(String[] args) {
        Operation op = (Operation) XMLUtil.getChartType("+");
        op.setNumA(10.56);
        op.setNumB(9.56);
        System.out.println(op.getResult());
    }
}
