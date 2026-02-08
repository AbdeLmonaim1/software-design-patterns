package designpatterns.decorator;

import designpatterns.decorator.decorators.Caramel;
import designpatterns.decorator.decorators.Chocolate;
import designpatterns.decorator.decorators.Milk;
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
        System.out.println("======================");
        drink  = new Milk(drink);
        System.out.println("Description : "+drink.getDescription());
        System.out.println("Cost : "+drink.cost());
        System.out.println("======================");
        drink  = new Chocolate(drink);
        System.out.println("Description : "+drink.getDescription());
        System.out.println("Cost : "+drink.cost());
        System.out.println("---------X2 Chocolate---------");
        drink = new Chocolate(drink);
        System.out.println("Description : "+drink.getDescription());
        System.out.println("Cost : "+drink.cost());
        drink = new Caramel(drink);
        System.out.println("Description : "+drink.getDescription());
        System.out.println("Cost : "+drink.cost());
    }
}
