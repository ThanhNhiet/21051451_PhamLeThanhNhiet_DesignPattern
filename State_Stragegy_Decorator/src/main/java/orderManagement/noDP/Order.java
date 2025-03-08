package orderManagement.noDP;

public class Order {
    private String orderNumber;
    private String orderDate;
    private Status status;

    public Order(String orderNumber, String orderDate, Status status) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.status = status;
    }

    public void display() {
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + status+"\n");
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
