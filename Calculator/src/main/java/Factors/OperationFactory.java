package Factors;

import Operations.*;

public class OperationFactory {
    public static Operation getOperation(String str){
        Operation op = null;
        if("+".equals(str)){
            op = new AddOperation();
        }
        else if("-".equals(str)){
            op = new SubOperation();
        }
        else if("/".equals(str)){
            op = new DivOperation();
        }
        else if("*".equals(str)){
            op = new MulOperation();
        }
        return op;
    }
}
