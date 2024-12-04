package ie.atu.project;

public class Team {
    private String teamName;
    private String country;
    private int foundYear;

    public Team(String teamName, String country, int foundYear){
        this.teamName = teamName;
        this.country = country;
        this.foundYear = foundYear;

    }
    // Getters and Setters
    public String getTeamName() {return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName;}

    public String getCountry() {return country; }
    public void setCountry(String country) { this.country = country;}

    public int getFoundedYear() {return foundYear; }
    public void setFoundedYear(String foundYear) { this.foundYear = foundYear;}

}
