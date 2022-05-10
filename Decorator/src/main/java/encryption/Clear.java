package encryption;

public class Clear extends EncryptionComponent{
    @Override
    public String encrypt(String contents) {
        return contents;
    }
}
