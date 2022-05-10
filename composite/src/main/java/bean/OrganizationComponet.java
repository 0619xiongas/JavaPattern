package bean;

public class OrganizationComponet {
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void addComponet(OrganizationComponet o){}

    public void removeComponet(OrganizationComponet o){}

    public OrganizationComponet getChild(int i){
        return null;
    }

    public void sendMessage(String msg){}

    public void onMessage(){}
}
