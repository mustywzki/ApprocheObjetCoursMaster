public class Reference {
    String ref;
    String name;
    String description;
    int price;

    Reference(String ref, String name, String desc, int price){
        this.ref = ref;
        this.name = name;
        this.description = desc;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
