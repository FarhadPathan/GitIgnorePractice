public class GitIgnorePractice {
    public static void main(String[] args) {
        String name = Helper.getInput("Enter your name: ");
        int age = Helper.getIntInput("Enter your age: ");
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
                Helper.closeScanner(); // Close scanner at the end
    }
}
