package orderManagement.haveDP_State.state;

import orderManagement.haveDP_State.OrderDP;

public class TaoMoiState implements State{
    @Override
    public void taoMoi(OrderDP orderDP) {
        System.out.println("Da tao moi don hang");
        orderDP.setState(new DangXuLyState());
    }

    @Override
    public void dangXuLy(OrderDP orderDP) {
        System.out.println("Chua tao moi don hang");
    }

    @Override
    public void daGiao(OrderDP orderDP) {
        System.out.println("don hang Chua xu ly");
    }

    @Override
    public void huy(OrderDP orderDP) {
        System.out.println("don hang chua ton tai");
    }
}
