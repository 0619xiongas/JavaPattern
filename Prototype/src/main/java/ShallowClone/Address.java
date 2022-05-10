package ShallowClone;

public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showAddress(){
        System.out.println("客户的地址在"+address);
    }
}
