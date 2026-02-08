package designpatterns.decorator.decorators;

import designpatterns.decorator.drinks.Drink;

public abstract class DrinkDecorator extends Drink {
    protected Drink drink;
    public DrinkDecorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public abstract String getDescription();
}
