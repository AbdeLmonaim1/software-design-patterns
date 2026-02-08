package designpatterns.decorator;

public class Cappuccino extends Drink {
    public Cappuccino(){
        description = "A coffee drink known for its creamy texture and smooth, balanced flavor. This coffee beverage is made with equal parts espresso, steamed milk, and milk foam on top.";
    }
    @Override
    public double cost() {
        return 18;
    }
}
