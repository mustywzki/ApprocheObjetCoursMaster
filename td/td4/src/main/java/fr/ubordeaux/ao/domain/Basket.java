package fr.ubordeaux.ao.domain;

import java.util.HashMap;

public class Basket {
    private int id;
    private HashMap<Reference,OrderLine> Orders;
    private int price;
    private boolean locked;

    public Basket(){
        this.id = this.hashCode();
        Orders = new HashMap<Reference,OrderLine>();
        this.price = 0;
        locked = false;
    }

    public void addOrder(OrderLine order){
        if (!locked){
            Orders.put(order.getReference(),order);
            this.price += order.getPrice();
        }
    }

    public void deleteOrder(Reference ref){
        if (!locked && Orders.containsKey(ref)){
            this.price -= Orders.get(ref).getPrice();
            Orders.remove(ref);   
        }
    }

    public void ValidateBasket(){
        locked = true;
    }

    public int getPrice(){
        return price;
    }

    public int getId(){
        return id;
    }
}
