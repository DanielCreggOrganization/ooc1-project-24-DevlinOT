package ie.atu.project;

public abstract class Team {
    // variables
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
    public void setFoundedYear(int foundYear) { this.foundYear = foundYear;}

     // Abstract method
     public abstract double calculateTeamStrength();

    //output
    @Override
    public String toString() {
        return "Team Name: " + teamName + ", Country: " + country + ", Founded: " + foundYear;
    }

}
