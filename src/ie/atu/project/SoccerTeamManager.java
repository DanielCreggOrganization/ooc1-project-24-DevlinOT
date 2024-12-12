package ie.atu.project;
import java.util.ArrayList;

public class SoccerTeamManager {
    private ArrayList<SoccerTeam> teams = new ArrayList<>();

    // adding a team
    public void addTeam(SoccerTeam team) {
        teams.add(team);
    }
    // deleting a team
    public boolean deleteTem(String teamName){
        return teams.removeIf(team -> team.getTeamName().equalsIgnoreCase(teamName));
    }

    // counting teams
    public int countTeams() {
        return teams.size();
    }

    //find teams
    public

}
