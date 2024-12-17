package ie.atu.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SoccerTeamManager manager = new SoccerTeamManager();
        Scanner scanner = new Scanner(System.in);
    

    while (true) {
        System.out.println("\nMenu");
        System.out.println("1. Add Soccer Team");
        System.out.println("2. Delete Soccer Team");
        System.out.println("3. List All Teams");
        System.out.println("4. Find Team by Name");
        System.out.println("5. Count Total Teams");
        System.out.println("6. Calculate Team Strength");
        System.out.println("7. Exit");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        

        if(choice == 1) {
            System.out.print("Enter team name: ");
            String name = scanner.next();

            System.out.print("Enter country: ");
            String country = scanner.next();
            
            System.out.print("Enter Founded year: ");
            int year = scanner.nextInt();

            System.out.print("Enter number of players: ");
            int players = scanner.nextInt();

            System.out.print("Enter league: ");
            String league = scanner.next();

            System.out.print("Enter coach name: ");
            String coach = scanner.next();

            System.out.print("Is the team a champion? (true/false): ");
            boolean champion = scanner.nextBoolean();

            System.out.print("Enter team budget (in millions): ");
            float budget = scanner.nextFloat();

            SoccerTeam team = new SoccerTeam(name, country, year, players, league, coach, champion, budget);
            manager.addTeam(team);
            System.out.println("Team added");
           


        }else if(choice == 2) {
            System.out.print("Enter team name to delete: ");
                    String deleteName = scanner.next();
                    if (manager.deleteTeam(deleteName)) {
                        System.out.println("Team deleted successfully!");
                    } else {
                        System.out.println("Team not found.");
                    }
                    
        }else if(choice == 3){
            System.out.println("Listing all teams:");
            manager.listAllTeams();
        }else if(choice == 4){
            System.out.print("Enter team name to find: ");
            String findName = scanner.next();
            SoccerTeam foundTeam = manager.findTeam(findName);
            if (foundTeam != null) {
                System.out.println("Team found: " + foundTeam);
            } else {
                System.out.println("Team not found.");
            }
        }else if(choice == 5){
            System.out.println("Total teams: " + manager.countTeams());
            
        }else if (choice == 6) { // Calculate Team Strength
            System.out.print("Enter team name to calculate strength: ");
            String teamName = scanner.next();
            SoccerTeam team = manager.findTeam(teamName);
            if (team != null) {
                System.out.println("Team strength for " + teamName + ": " + team.calculateTeamStrength());
            } else {
                System.out.println("Team not found.");
            }
        }else if(choice == 7){
            System.out.println("Exiting...");
            
        }else{
            System.out.println("Invalid choice. Try again."); 
        }

}

}
}

