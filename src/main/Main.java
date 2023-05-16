package main;
import utilities.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showWelcomeMessage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.showMenu();
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            menu.processOption(option);
        }
    }
}