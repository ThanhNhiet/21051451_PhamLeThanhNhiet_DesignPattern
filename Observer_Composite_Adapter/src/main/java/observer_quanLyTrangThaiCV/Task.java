package observer_quanLyTrangThaiCV;

// Subject Interface (Task)
public interface Task {
    void registerTeamMember(TeamMember teamMember);
    void removeTeamMember(TeamMember teamMember);
    void notifyTeamMembers();
}
