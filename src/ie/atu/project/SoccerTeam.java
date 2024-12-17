package ie.atu.project;

public class SoccerTeam extends Team {
    // variables
    private int numberOfPlayers;
    private String league;
    private String coachName;
    private boolean isChampion;
    private float teamBudget;

    public SoccerTeam(String teamName, String country, int foundedYear, int numberOfPlayers, String league,
            String coachName, boolean isChampion, float teamBudget) {
        super(teamName, country, foundedYear);
        this.numberOfPlayers = numberOfPlayers;
        this.league = league;
        this.coachName = coachName;
        this.isChampion = isChampion;
        this.teamBudget = teamBudget;
    }

    // getters and setters
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public boolean isChampion() {
        return isChampion;
    }

    public void setChampion(boolean champion) {
        isChampion = champion;
    }

    public float getTeamBudget() {
        return teamBudget;
    }

    public void setTeamBudget(float teamBudget) {
        this.teamBudget = teamBudget;
    }

    // Implement abstract method
    @Override
    public double calculateTeamStrength() {
        return numberOfPlayers * (isChampion ? 1.5 : 1.0) + teamBudget / 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", League: " + league + ", Coach: " + coachName +
                ", Champion: " + isChampion + ", Budget: $" + teamBudget + "M" +
                ", Strength: " + calculateTeamStrength();
    }
}
