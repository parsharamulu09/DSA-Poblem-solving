//Complete the function printNumber which takes an integer input from the user and prints it on the screen
import java.util.*;

public class inputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline
        String s = scanner.nextLine();

        System.out.println(a);
        System.out.println(s);
    }
}
