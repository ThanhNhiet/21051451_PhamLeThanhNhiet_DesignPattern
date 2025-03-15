package observer_coPhieu;
//Concrete Observer
public class ConcreteInvestor implements Investor{
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(float stockPrice) {
        System.out.println(name + " Notify - stock price change: " + stockPrice);
    }
}
