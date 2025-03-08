package priceFoodCaculator.decorator;

import priceFoodCaculator.Food;

public class WaterDecorator extends FoodDecorator{
    public WaterDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Water";
    }

    @Override
    public double getCost() {
        return food.getCost() + 0.5;
    }
}
