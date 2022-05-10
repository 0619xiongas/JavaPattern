package Format;

public class XMLformat extends Format{
    @Override
    public void parseFile(){
        System.out.print(imp.doFormat()+"XML格式");
    }
}
