package payment.strategyPD;

public class SpecialTax implements TaxStrategy{
    @Override
    public double calculateTax(double price) {
        return price * 0.3;
    }
}
