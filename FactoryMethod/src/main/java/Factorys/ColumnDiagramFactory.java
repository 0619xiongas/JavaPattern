package Factorys;

import Diagrams.*;

public class ColumnDiagramFactory implements DiagramFactory{
    @Override
    public Diagram createDiagram() {
        Diagram d = new ColumnDiagram();
        return d;
    }
}
