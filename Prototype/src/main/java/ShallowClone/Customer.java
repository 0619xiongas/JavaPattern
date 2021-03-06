package ShallowClone;

public class Customer implements Cloneable{
    private Address address;
    private String name;
    private String phone;
    private String sex;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public Customer clone(){
        Object obj = null;
        try{
            obj = super.clone();
            return (Customer) obj;
        }catch (CloneNotSupportedException e){
            System.out.println("不能复制");
            return null;
        }
    }
}
