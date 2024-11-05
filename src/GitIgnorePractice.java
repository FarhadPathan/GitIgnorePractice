import java.util.Scanner;

public class GitIgnorePractice {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String message1 = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String message2 = scanner2.nextLine();

        System.out.println("Your Full Name:"+message1+" "+message2);
    }
}
