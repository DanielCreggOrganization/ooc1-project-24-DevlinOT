package ie.atu.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SoccerTeamManager manager = new SoccerTeamManager();
        Scanner scanner = new Scanner(System.in);
    }

    while (true) {
        System.out.println("\nMenu");
        System.out.println("1. Add Soccer Team");
        System.out.println("2. Delete Soccer Team");
        System.out.println("3. List All Teams");
        System.out.println("4. Find Team by Nam");
        System.out.println("5. Count Total Teams");
        System.out.println("6. Exit");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        

        switch (choice) {
            case 1:
            System.out.print("Enter team name: ");
            String name = scanner.nextLine();

            System.out.print("Enter country: ");
            String country = scanner.nextLine();
            
            System.out.print("Enter Founded year: ");
            int year = scanner.nextInt();

            System.out.print("Enter number of players: ");
            int players = scanner.nextInt();

            System.out.print("Enter league: ");
            String league = scanner.nextLine();

            System.out.print("Enter coach name: ");
            String coach = scanner.nextLine();

            System.out.print("Is the team a champion? (true/false): ");
            boolean champion = scanner.nextBoolean();

            System.out.print("Enter team budget (in millions): ");
            float budget = scanner.nextFloat();

            SoccerTeam team = new SoccerTeam(name, country, year, players, league, coach, champion, budget);
            SoccerTeamManager.addTeam(team);
            System.out.println("Team added");
            break;


        }
    }

}
