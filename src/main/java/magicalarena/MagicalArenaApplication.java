package magicalarena;

import java.util.InputMismatchException;
import java.util.Scanner;
import magicalarena.model.Player;
import magicalarena.service.GameService;

public class MagicalArenaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter name, health, strength and attack values of first player:");
            Player firstPlayer = new Player(sc.nextLine(), getInput(sc, "health"), getInput(sc, "strength"), getInput(sc, "attack"));
            sc.nextLine();
            System.out.println("Enter name, health, strength and attack values of second player:");
            Player secondPlayer = new Player(sc.nextLine(), getInput(sc, "health"), getInput(sc, "strength"), getInput(sc, "attack"));

            GameService gameService = new GameService();
            Player winner = gameService.getWinner(firstPlayer, secondPlayer);
            System.out.println(winner.getName() + " wins the game!\n");

            System.out.println("Do you want to play another match? (yes/no)");
            String response = sc.next();
            if ("yes".equalsIgnoreCase(response)) {
                main(args);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input. Please enter positive integers for health, strength, and attack values.");
        } finally {
            sc.close();
        }
    }

    static int getInput(Scanner sc, String attribute) {
        int value;
        while (true) {
            System.out.print("Enter " + attribute + " value: ");
            value = sc.nextInt();
            if (value > 0) {
                break;
            } else {
                System.out.println(attribute + " must be a positive integer.");
            }
        }
        return value;
    }

}
