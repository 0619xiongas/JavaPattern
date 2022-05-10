package encryption;

public class VigenereCrypt extends ComponentDecorator{
    private EncryptionComponent component;
    public VigenereCrypt(EncryptionComponent component) {
        super(component);
    }
    @Override
    public String encrypt(String contents){
        String K = "cipher";
        StringBuffer sb = new StringBuffer();
        char[] prr = contents.toCharArray();
        char[] krr = K.toCharArray();
        int flag = 0;
        for(int i=0;i<prr.length;i++){
            if(prr[i] >= 'a' && prr[i] <= 'z'){
                int num = (i-flag) % krr.length;
                char ch = (char) ((prr[i] - 97 + krr[num] - 97)% 26 + 97);
                sb.append(ch);
            }
            else if(prr[i] >= 'A' && prr[i] <= 'Z'){
                int num = (i - flag) % krr.length;
                char ch = (char) ((prr[i] - 65 + krr[num] - 97)% 26 + 65);
                sb.append(ch);
            }
            else{
                sb.append(prr[i]);
                flag++;
            }
        }
        return sb.toString();
    }
}
