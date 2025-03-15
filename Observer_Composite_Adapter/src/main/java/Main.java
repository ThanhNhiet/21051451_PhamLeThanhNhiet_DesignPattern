import observer_coPhieu.ConcreteInvestor;
import observer_coPhieu.ConcreteStock;
import observer_coPhieu.Investor;
import observer_quanLyTrangThaiCV.ConcreteTask;
import observer_quanLyTrangThaiCV.ConcreteTeamMember;
import observer_quanLyTrangThaiCV.TeamMember;

public class Main {
    private static void CoPhieu_ObserverPattern(){
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

    public static void QLtrangThaiCV_ObserverPartern () {
        ConcreteTask task = new ConcreteTask("phat trien chuc nang aaa");
        TeamMember member1 = new ConcreteTeamMember("Linh");
        TeamMember member2 = new ConcreteTeamMember("Hai");

        task.registerTeamMember(member1);
        task.registerTeamMember(member2);

        task.setStatus("Dang thuc hien");
        task.setStatus("Hoan thanh");
    }

    public static void main(String[] args) {
//        CoPhieu_ObserverPattern();

        QLtrangThaiCV_ObserverPartern();
    }
}