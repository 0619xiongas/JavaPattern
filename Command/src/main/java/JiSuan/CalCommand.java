package JiSuan;

public class CalCommand extends Command {

    public CalCommand(Caculator cal,int num) {
        super(cal,num);

    }
    @Override
    public void Execute() {
        cal.Operation(num);
    }

    @Override
    public void UnExecute() {
        cal.Operation(-num);
    }

}