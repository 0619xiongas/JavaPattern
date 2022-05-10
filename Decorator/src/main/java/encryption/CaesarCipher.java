package encryption;

import java.util.Locale;

public class CaesarCipher extends ComponentDecorator{
    private EncryptionComponent component;
    public CaesarCipher(EncryptionComponent component) {
        super(component);
    }

    @Override
    public String encrypt(String contents){
        int key = 3;
        char[] arr = contents.toLowerCase(Locale.ROOT).toCharArray();
        char[] brr = new char[arr.length];
        for(int i=0;i<arr.length;i++){
            int num1 = arr[i] - 97;
            int num2 = (num1 + key) % 26;
            brr[i] = (char) (num2+ 97);
        }
        return new String(brr).toUpperCase(Locale.ROOT);
    }
}
