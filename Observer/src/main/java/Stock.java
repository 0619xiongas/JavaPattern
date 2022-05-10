import jdk.nashorn.internal.ir.Flags;

import java.util.ArrayList;

public class Stock {
    private ArrayList<MyObserver> myObservers;
    private String name;
    private float price;
    public Stock(String name,float price){
        this.name = name;
        this.price = price;
        myObservers = new ArrayList<>();
    }
    public void attach(MyObserver myObserver){
        myObservers.add(myObserver);
    }
    public void detach(MyObserver myObserver){
        myObservers.remove(myObserver);
    }
    public void myNotify(){
        for(MyObserver o:myObservers){
            o.response(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        float range = Math.abs((price-this.price)/this.price);
        this.price = price;
        if(range>=0.05){
            this.myNotify();
        }
    }
}
