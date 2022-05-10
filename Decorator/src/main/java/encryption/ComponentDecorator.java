package encryption;

public class ComponentDecorator extends EncryptionComponent {
    private EncryptionComponent component;

    public ComponentDecorator(EncryptionComponent component){
        this.component = component;
    }
    public String encrypt(String content){
        return component.encrypt(content);
    }
}
