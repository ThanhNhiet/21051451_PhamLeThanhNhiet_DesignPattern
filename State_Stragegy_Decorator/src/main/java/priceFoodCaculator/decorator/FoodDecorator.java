package priceFoodCaculator.decorator;

import priceFoodCaculator.Food;

public abstract class FoodDecorator implements Food {
    protected Food food;

    public FoodDecorator(Food food){
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription();
    }

    @Override
    public double getCost() {
        return food.getCost();
    }
}
