import java.util.Arrays;
import java.util.Random;

public class shuffle {
    public static void main(String[] args) {
        // Create the original array
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        
        // Shuffle the array
        shuffleArray(originalArray);
        
        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(originalArray));
    }

    // Fisher-Yates shuffle algorithm
    static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
