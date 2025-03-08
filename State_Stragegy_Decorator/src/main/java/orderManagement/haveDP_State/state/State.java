package orderManagement.haveDP_State.state;

import orderManagement.haveDP_State.OrderDP;

public interface State {
    void taoMoi(OrderDP orderDP);
    void dangXuLy(OrderDP orderDP);
    void daGiao(OrderDP orderDP);
    void huy(OrderDP orderDP);
}
