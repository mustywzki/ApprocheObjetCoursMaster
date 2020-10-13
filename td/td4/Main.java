public class Main {
    public static void main (String[] args){
        Client c = new Client("Jean");
        Basket basket = c.getBasket();

        // Refs & catalog
        Reference AAA = new Reference("AAA","Prezidente","super fauteuil",196);
        Reference BBB = new Reference("BBB","Prezidente 2","super fauteuil version 2", 250);
        Reference CCC = new Reference("CCC","Table wlk vlvlzsk", "trop cool mais on peut pas le prononcer", 600);

        System.out.println("Add to Basket amount 2 Prezidente");
        basket.addOrder(new OrderLine(AAA,2));

        System.out.println("Current Price: " + basket.getPrice());


        System.out.println("Add to Basket amount 5 Tables");
        basket.addOrder(new OrderLine(CCC,5));

        System.out.println("Current Price: " + basket.getPrice());

        System.out.println("Remove to Basket amount 2 Prezidente");
        basket.deleteOrder(AAA);

        System.out.println("Current Price: " + basket.getPrice());
    } 
}
