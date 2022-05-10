package encryption;

public class Affine extends ComponentDecorator{
    private EncryptionComponent component;
    public Affine(EncryptionComponent component) {
        super(component);
    }
    @Override
    public String encrypt(String contents){
        int k1 = 9,k2 = 5;
        StringBuffer sb = new StringBuffer();
        char[] arr = contents.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                int num = (k1*(arr[i] - 97) + k2) % 26 + 97;
                char ch = (char) num;
                sb.append(ch);
            }
            else {
                int num = (k1*(arr[i] - 65) + k2) % 26 + 65;
                char ch = (char) num;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
