package payment.strategyPD;

public class ComsumeTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.05;
    }
}
