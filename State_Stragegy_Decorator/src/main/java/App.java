import orderManagement.haveDP_State.OrderDP;
import orderManagement.noDP.Order;
import orderManagement.noDP.Status;

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
    public static void main(String[] args) {
//        noDPDemo();

        dpDemo_State();
    }
}
