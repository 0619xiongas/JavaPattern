package Format;

import Database.*;

public  abstract class Format {
    protected DatabaseImp imp;

    public void setFormatImp(DatabaseImp imp) {
        this.imp = imp;
    }
    public abstract void parseFile();
}
