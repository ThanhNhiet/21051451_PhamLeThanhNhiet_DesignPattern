package observer_quanLyTrangThaiCV;

// Concrete Observer (Team Member)
public class ConcreteTeamMember implements TeamMember {
    private String name;

    public ConcreteTeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskStatus) {
        System.out.println(name + " nhận được thông báo: Trạng thái công việc là " + taskStatus);
    }
}


