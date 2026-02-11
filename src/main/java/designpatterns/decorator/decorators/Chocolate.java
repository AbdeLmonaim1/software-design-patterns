package designpatterns.decorator.decorators;

import designpatterns.decorator.drinks.Drink;

public class Chocolate extends DrinkDecorator {
    public Chocolate(Drink drink) {
        super(drink);
    }



    @Override
    public double cost() {
        return 1.9 + drink.cost();
    }


    @Override
    public String getDescription() {
        return drink.getDescription()+" With Chocolate";
    }
}
