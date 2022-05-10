import Diagrams.Diagram;
import Factorys.ColumnDiagramFactory;
import Factorys.DiagramFactory;

public class Test {
    public static void main(String[] args) {
        Diagram diagram;
        DiagramFactory factory;
        factory = new ColumnDiagramFactory();
        diagram = factory.createDiagram();
        diagram.painting();
    }
}
