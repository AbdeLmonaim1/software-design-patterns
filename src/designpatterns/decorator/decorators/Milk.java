package designpatterns.decorator.decorators;

import designpatterns.decorator.drinks.Drink;

public class Milk extends DrinkDecorator {
    public Milk(Drink drink) {
        super(drink);
    }



    @Override
    public double cost() {
        return 1 + drink.cost();
    }

//    @Override
//    public String getDescription() {
//        return super.getDescription()+ " With Milk";
//    }
    @Override
    public String getDescription() {
        return drink.getDescription()+" With Milk";
    }
}
