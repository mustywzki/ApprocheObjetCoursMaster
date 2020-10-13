package fr.ubordeaux.ao.domain;

public class Client {
    String name;
    Basket basket;

    public Client(String name){
        this.name = name;
        basket = new Basket();
    }

    public Basket getBasket(){
        return basket;
    }
    
}
