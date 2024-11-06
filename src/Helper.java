import java.util.Scanner;
public class Helper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        String message = scanner.nextLine();
        System.out.print(prompt + message);
        return message; // replace with actual input
    }
    public static int getIntInput(String prompt) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return number; // Return the valid integer input
    }
    public static void closeScanner() {
    }
}