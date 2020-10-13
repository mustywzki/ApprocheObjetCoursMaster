public class Client {
    String name;
    Basket basket;

    Client(String name){
        this.name = name;
        basket = new Basket();
    }

    Basket getBasket(){
        return basket;
    }
    
}
