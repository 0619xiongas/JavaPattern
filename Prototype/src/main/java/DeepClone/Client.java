package DeepClone;

import DeepClone.*;

public class Client {
    public static void main(String[] args) {
        DeepClone.Customer c1,c2 = null;
        c1 = new Customer();
        DeepClone.Address address = new Address();
        c1.setAddress(address);
        try{
            c2 = c1.deepClone();
        }catch (Exception e){
            System.out.println("复制失败");
        }
        System.out.println("客户是否相同"+(c1 == c2));
        System.out.println("地址是否相同"+(c1.getAddress() == c2.getAddress()));
    }
}
