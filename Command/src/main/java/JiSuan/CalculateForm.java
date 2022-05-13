package JiSuan;

import java.util.ArrayList;

public class CalculateForm {
    protected Caculator caculator = new Caculator();
    private ArrayList<Command> commands = new ArrayList<Command>();
    private ArrayList<Command> commands1 = new ArrayList<>();
    private int count = 0;

    public void Compute(Command command) {
        command.Execute();
        count++;
        commands.add(command);
        commands1.add(command);

    }
    public void Redo() {
        System.out.print("恢复后：");
        commands1.get(count - 1).Execute();
        commands1.remove(count-1);
        count--;
    }

    public void Undo() {
        System.out.print("撤销后：");
        commands.get(count-1).UnExecute();
        commands.remove(count-1);
    }
}