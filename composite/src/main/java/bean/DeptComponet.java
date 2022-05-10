package bean;

import java.util.HashSet;
import java.util.Set;

public class DeptComponet extends OrganizationComponet{
    public Set<OrganizationComponet> setO1 = new HashSet<>();
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void addComponet(OrganizationComponet o){
        setO1.add(o);
    }
    public void removeComponet(OrganizationComponet o){
        setO1.remove(o);
    }
    public OrganizationComponet getChild(int i){
        System.out.println("取代子元素");
        return null;
    }
    public void sendMessage(String msg) {
        System.out.println(this.getName()+"发送公文");
        for (OrganizationComponet oc:setO1) {
            if (oc instanceof DeptComponet){
                oc.sendMessage(msg);
            }else if (oc instanceof Office){
                oc.onMessage();
            }
        }
    }
    public void onMessage() {
        System.out.println("错误的方法");
    }
}
