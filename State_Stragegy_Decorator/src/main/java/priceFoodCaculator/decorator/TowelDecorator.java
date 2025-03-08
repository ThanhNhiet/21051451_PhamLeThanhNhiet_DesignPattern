package priceFoodCaculator.decorator;

import priceFoodCaculator.Food;

public class TowelDecorator extends FoodDecorator{
    public TowelDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Towel";
    }

    @Override
    public double getCost() {
        return food.getCost() + 0.2;
    }
}
