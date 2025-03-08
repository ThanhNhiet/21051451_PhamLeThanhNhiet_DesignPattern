package priceFoodCaculator;

public class SimpleFood implements Food{

    @Override
    public String getDescription() {
        return "simple food";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
