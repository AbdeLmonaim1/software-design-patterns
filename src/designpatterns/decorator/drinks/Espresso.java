package designpatterns.decorator.drinks;

public class Espresso extends Drink {
    public Espresso(){
        description = "Espresso is a strong concentrated coffee drink typically served in a small espresso cup. It is commonly used as a base for many coffee drinks such as lattes, cappuccinos, and macchiatos.";
    }
    @Override
    public double cost() {
        return 12;
    }
}
