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
        scanner.nextLine(); 
    }

}
