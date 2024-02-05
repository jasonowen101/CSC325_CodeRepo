import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
// import java.io.Console;

// public class GameHelper {
//     public int getUserInput(String prompt) {
//         Console console = System.console();
//         if (console == null) {
//             System.out.println("Console not available. Exiting.");
//             System.exit(1);
//         }

//         String input = console.readLine(prompt + ": ");
//         try {
//             return Integer.parseInt(input);
//         } catch (NumberFormatException e) {
//             System.out.println("Please enter a valid number.");
//             return getUserInput(prompt); // Recursively call the method for valid input
//         }
//     }
// }
