import Database.*;
import Format.*;

public class Client {
    public static void main(String[] args) {
        Format format;
        DatabaseImp imp;
        format = new PDFformat();
        imp = new MySqlDatabase();
        format.setFormatImp(imp);

        format.parseFile();
    }
}
