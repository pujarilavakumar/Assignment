import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitive comparison
        boolean isPangram = checkIfPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }
        
        // Iterate through the input string and remove characters from the set
        for (char ch : input.toCharArray()) {
            alphabetSet.remove(ch);
        }
        
        // If the set is empty, it's a pangram
        return alphabetSet.isEmpty();
    }
}
