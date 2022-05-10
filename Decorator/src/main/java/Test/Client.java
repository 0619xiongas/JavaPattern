package Test;
import encryption.*;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        EncryptionComponent component1,component2,component3;
        System.out.println("输入要加密的字符：");
        String str = new Scanner(System.in).nextLine();
        component1 = new Clear();
        component2 = new Affine(component1);
        component3 = new CaesarCipher(component2);
        System.out.println(component3.encrypt(str));
    }
}
