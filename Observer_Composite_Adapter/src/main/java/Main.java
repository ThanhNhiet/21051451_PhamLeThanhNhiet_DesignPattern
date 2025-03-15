import observer_coPhieu.ConcreteInvestor;
import observer_coPhieu.ConcreteStock;
import observer_coPhieu.Investor;

public class Main {
    private static void StockObserverPattern(){
        ConcreteStock stock = new ConcreteStock("AAPL");
        Investor investor1 = new ConcreteInvestor("Nguyễn A");
        Investor investor2 = new ConcreteInvestor("Trần B");

        stock.registerInvestor(investor1);
        stock.registerInvestor(investor2);

        System.out.println("First change price: 150");
        stock.setPrice(150);
        System.out.println("\nSecond change price: 160");
        stock.setPrice(160);
    }

    public static void main(String[] args) {
        StockObserverPattern();
    }
}