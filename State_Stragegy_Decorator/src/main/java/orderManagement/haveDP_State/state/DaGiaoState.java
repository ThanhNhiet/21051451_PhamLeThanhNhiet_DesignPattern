package orderManagement.haveDP_State.state;

import orderManagement.haveDP_State.OrderDP;

public class DaGiaoState implements State{
    @Override
    public void taoMoi(OrderDP orderDP) {
        System.out.println("Don hang da tao truoc roi");
    }

    @Override
    public void dangXuLy(OrderDP orderDP) {
        System.out.println("Don hang da duoc xu ly");
    }

    @Override
    public void daGiao(OrderDP orderDP) {
        System.out.println("Don hang da duoc giao");
    }

    @Override
    public void huy(OrderDP orderDP) {
        System.out.println("Don hang da giao thanh cong nen khong huy duoc");
    }
}
