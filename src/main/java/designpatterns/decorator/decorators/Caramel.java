package designpatterns.decorator.decorators;

import designpatterns.decorator.drinks.Drink;

public class Caramel extends DrinkDecorator {
    public Caramel(Drink drink) {
        super(drink);
    }



    @Override
    public double cost() {
        return 2.2 + drink.cost();
    }


    @Override
    public String getDescription() {
        return drink.getDescription()+" With Caramel";
    }
}
