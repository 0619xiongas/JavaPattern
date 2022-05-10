package Factorys;

import Diagrams.Diagram;
import Diagrams.LineDiagram;

public class LineDiagramFactory implements DiagramFactory{
    @Override
    public Diagram createDiagram() {
        Diagram d = new LineDiagram();
        return d;
    }
}
