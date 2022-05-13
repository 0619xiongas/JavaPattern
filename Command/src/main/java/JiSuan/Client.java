package JiSuan;

public class Client {
    public static void main(String[] args) {
        CalculateForm c = new CalculateForm();
        c.Compute(new CalCommand(c.caculator,100));
        c.Compute(new CalCommand(c.caculator,50));
        c.Compute(new CalCommand(c.caculator,20));
        c.Compute(new CalCommand(c.caculator,2));
        c.Undo();
        c.Undo();
        c.Redo();
    }
}
