import java.util.ArrayList;

public class CalculationForm {
    private Adder adder = new Adder();
    private ArrayList<AbstractCommand> list= new ArrayList<>();
    private int count = 0;
    // 二次撤销
    public void redo(){
        System.out.print("恢复操作后");
        list.get(count).execute();
        list.remove(count);
    }
    // 撤销一次
    public void undo(){
        count = list.size()-1;
        System.out.print("撤销操作后");
        list.get(count).unexecute();

    }
    public void compute(int value){
        AbstractCommand command = new AddCommand(adder,value);
        command.execute();
        list.add(command);
    }
}
