package fr.ubordeaux.ao.domain;

public class OrderLine {
    Reference ref;
    int amount;
    int price;

    public OrderLine(Reference ref, int amount){
        this.ref = ref;
        this.amount = amount;
        this.price = this.amount * this.ref.getPrice();
    }

    public Reference getReference(){
        return ref;
    }

    public int getPrice(){
        return price;
    }

}
