package designpatterns.decorator;

import designpatterns.decorator.drinks.Cappuccino;
import designpatterns.decorator.drinks.Drink;
import designpatterns.decorator.drinks.Espresso;
import designpatterns.decorator.drinks.Latte;
public class Test {
    public static void main(String[] args) {
        Drink drink;
        drink = new Espresso();
        System.out.println("Description : "+drink.getDescription());
        System.out.println("Cost : "+drink.cost());
    }
}
