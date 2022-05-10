package ShallowClone;

public class Client {
    public static void main(String[] args) {
        Customer c1,c2;
        c1 = new Customer();
        Address address = new Address();
        c1.setAddress(address);
        c2 = c1.clone();
        System.out.println("客户是否相同"+(c1 == c2));
        System.out.println("地址是否相同"+(c1.getAddress() == c2.getAddress()));
    }
}
