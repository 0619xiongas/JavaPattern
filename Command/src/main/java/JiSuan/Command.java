package JiSuan;

public abstract class Command {
    protected Caculator cal;
    protected int num;

    public Command(Caculator cal,int num) {

        this.cal = cal;
        this.num = num;
    }
    public abstract void Execute();
    public abstract void UnExecute();
}