package observer_quanLyTrangThaiCV;

import java.util.ArrayList;
import java.util.List;

public class ConcreteTask implements Task {
    private String taskName;
    private String status;
    private List<TeamMember> teamMembers = new ArrayList<>();

    public ConcreteTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void registerTeamMember(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }

    @Override
    public void removeTeamMember(TeamMember teamMember) {
        teamMembers.remove(teamMember);
    }

    @Override
    public void notifyTeamMembers() {
        for (TeamMember member : teamMembers) {
            member.update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyTeamMembers();
    }
}
