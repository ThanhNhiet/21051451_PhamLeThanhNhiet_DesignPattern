package orderManagement.haveDP_State;

import orderManagement.haveDP_State.state.State;
import orderManagement.haveDP_State.state.TaoMoiState;

public class OrderDP {
    private String orderNumber;
    private String orderDate;
    private State state;

    public OrderDP(String orderNumber, String orderDate) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.state = new TaoMoiState();
    }

    public void display() {
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Order Date: " + orderDate);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void taoMoi() {
        state.taoMoi(this);
    }
    public void dangXuLy() {
        state.dangXuLy(this);
    }

    public void daGiao() {
        state.daGiao(this);
    }

    public void huy() {
        state.huy(this);
    }

    public void displayNumber() {
        System.out.println("Order Number: " + orderNumber);
    }
}
