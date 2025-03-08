package payment.strategyPD;

public class VAT implements TaxStrategy{
    @Override
    public double calculateTax(double price) {
        return price * 0.1;
    }
}
