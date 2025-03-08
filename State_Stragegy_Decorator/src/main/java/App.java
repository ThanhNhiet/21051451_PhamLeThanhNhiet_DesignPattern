import orderManagement.noDP.Order;
import orderManagement.noDP.Status;

public class App {

    public static void noDPDemo() {
        Order order = new Order("123", "2021-07-01", Status.MOI_TAO);
        order.display();
        order.setStatus(Status.DANG_XU_LY);
        order.display();
    }
    public static void main(String[] args) {
        noDPDemo();
    }
}
