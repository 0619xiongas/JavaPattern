public class Client {
    public static void main(String[] args) {
        CalculationForm c =new CalculationForm();
        c.compute( 100);
        c.compute(50);
        c.compute( 20);
        c.compute( 2);
        c.undo();
        c.redo();
    }
}
