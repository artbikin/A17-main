package lesson11am2;

public class Team {
    private Person leader;
    private Person teamMember1;

    public Team(Person leader, Person teamMember1) {
        this.leader = leader;
        this.teamMember1 = teamMember1;
    }

    @Override
    public String toString() {
        return "Team{" +
                "leader=" + leader +
                ", teamMember1=" + teamMember1 +
                '}';
    }

    public void setLeader(Person leader) {
        this.leader = leader;
    }

    public void setTeamMember1(Person teamMember1) {
        this.teamMember1 = teamMember1;
    }

    public Person getLeader() {
        return leader;
    }

    public Person getTeamMember1() {
        return teamMember1;
    }
}
