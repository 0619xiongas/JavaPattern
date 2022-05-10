package Format;

public class TXTformat extends Format{
    @Override
    public void parseFile(){
        System.out.print(imp.doFormat()+"TXT格式");
    }
}
