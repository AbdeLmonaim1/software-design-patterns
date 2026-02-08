package designpatterns.decorator;

public class Latte extends Drink {
    public Latte(){
        description = "A coffee drink made by mixing steamed milk and espresso with a layer of foam added to the top. Latte is known for its mild and creamy taste and can be served hot or cold.";
    }
    @Override
    public double cost() {
        return 14;
    }
}
