package observer_coPhieu;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject (Stock)
public class ConcreteStock implements Stock {
    private String symbol;
    private float price;
    private List<Investor> investors = new ArrayList<>();

    public ConcreteStock(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void registerInvestor(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(price);
        }
    }

    public void setPrice(float price) {
        this.price = price;
        notifyInvestors();
    }
}
