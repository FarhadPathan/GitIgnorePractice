import java.util.Scanner;
public class Helper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        String message = scanner.nextLine();
        System.out.print(prompt + message);
        return null; // replace with actual input
    }
    public static int getIntInput(String prompt) {
        String message = scanner.nextLine();
        System.out.print(prompt + message);
        return 0;
    }
    public static void closeScanner() {
    }
}