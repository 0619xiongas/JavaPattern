package Format;

public class PDFformat extends Format{
    @Override
    public void parseFile(){
        System.out.print(imp.doFormat()+"PDF格式");
    }
}
