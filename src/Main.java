import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Alice", "Bob", "Charlie", "David", "Emma",
                "Frank", "Grace", "Henry", "Isabella", "Jack",
                "Katie", "Liam", "Mia", "Noah", "Olivia",
                "Peter", "Quinn", "Ryan", "Sophia", "Thomas"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first letter of a name: ");
        char input = scanner.next().toUpperCase().charAt(0);
        boolean found = false;
        for (String name : names) {
            if (name.charAt(0) == input) {
                System.out.println("Name: " + name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No name found starting with " + input);
        }
    }
}