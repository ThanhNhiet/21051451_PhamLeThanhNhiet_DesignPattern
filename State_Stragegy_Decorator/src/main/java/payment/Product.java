package payment;

import payment.strategyPD.TaxStrategy;

public class Product {
    private double price;
    private String name;
    private TaxStrategy tax;

    public Product(double price, String name, TaxStrategy tax) {
        this.price = price;
        this.name = name;
        this.tax = tax;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax.calculateTax(price);
    }

    public double getPriceWithTax() {
        return price + getTax();
    }
}
