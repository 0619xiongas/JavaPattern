package bean;

public class Office extends OrganizationComponet{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addComponet(OrganizationComponet o){
        System.out.println("错误的方法");
    }
    @Override
    public void removeComponet(OrganizationComponet o){
        System.out.println("错误的方法");
    }
    @Override
    public OrganizationComponet getChild(int i){
        System.out.println("错误的方法");
        return null;
    }
    @Override
    public void sendMessage(String msg) {
        System.out.println("错误的方法");
    }
    @Override
    public void onMessage() {
        System.out.println(this.getName()+"接收公文");
    }

}
