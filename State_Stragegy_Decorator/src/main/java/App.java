import orderManagement.haveDP_State.OrderDP;
import orderManagement.noDP.Order;
import orderManagement.noDP.Status;
import payment.Product;
import payment.strategyPD.ComsumeTax;
import payment.strategyPD.SpecialTax;
import payment.strategyPD.VAT;
import priceFoodCaculator.Food;
import priceFoodCaculator.SimpleFood;
import priceFoodCaculator.decorator.TowelDecorator;
import priceFoodCaculator.decorator.WaterDecorator;

public class App {

    public static void noDPDemo() {
        Order order = new Order("123", "2021-07-01", Status.MOI_TAO);
        order.display();
        order.setStatus(Status.DANG_XU_LY);
        order.display();
    }

    public static void dpDemo_State() {
        OrderDP order = new OrderDP("111", "2021-07-01");
        order.display();
        order.taoMoi();
        order.dangXuLy();
        order.daGiao();
        order.huy();

        System.out.println("\n====================================\n");

        OrderDP order1 = new OrderDP("222", "2021-07-01");
        order1.display();
        order1.dangXuLy();
        order1.daGiao();
        order1.huy();

        System.out.println("\n====================================\n");

        OrderDP order2 = new OrderDP("333", "2021-07-01");
        order2.display();
        order2.taoMoi();
        order2.dangXuLy();
        order2.huy();
    }

    public static void dpDemo_Strategy() {
        Product product1 = new Product(100, "Nuoc", new ComsumeTax());
        System.out.println(product1.getName() +  "-" + product1.getPriceWithTax() + " VND");

        System.out.println("\n====================================\n");

        Product product2 = new Product(200, "Dien", new VAT());
        System.out.println(product2.getName() +  "-" + product2.getPriceWithTax() + " VND");

        System.out.println("\n====================================\n");

        Product product3 = new Product(300, "Ruou", new SpecialTax());
        System.out.println(product3.getName() +  "-" + product3.getPriceWithTax() + " VND");
    }

    public static void dpDemo_Decorator() {
        Food food = new SimpleFood();
        System.out.println(food.getDescription() + " - " + food.getCost());

        System.out.println("\n====================================\n");

        food = new WaterDecorator(food);
        System.out.println(food.getDescription() + " - " + food.getCost());

        System.out.println("\n====================================\n");
        food = new TowelDecorator(food);
        System.out.println(food.getDescription() + " - " + food.getCost());
    }
    public static void main(String[] args) {
//      noDPDemo();

//      dpDemo_State();

//        dpDemo_Strategy();

        dpDemo_Decorator();
    }
}
