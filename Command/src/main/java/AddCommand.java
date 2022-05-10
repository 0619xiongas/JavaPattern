public class AddCommand extends AbstractCommand{
    private Adder adder;
    private int value;

    public AddCommand(Adder adder, int value) {
        super();
        this.adder = adder;
        this.value = value;
    }

    // 执行，也是相当于二次撤销
    @Override
    public void execute() {
        adder.add(value);
    }

    //撤销
    @Override
    public void unexecute() {
        adder.add(-value);
    }
}
