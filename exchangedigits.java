import java.util.Arrays;
import java.util.Scanner;

public class exchangedigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers separated by space
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Find the nearest larger number
        int result = findNearestLargerNumber(a, b);

        // Output the result
        System.out.println(result);

        scanner.close();
    }

    private static int findNearestLargerNumber(int a, int b) {
        // Convert the numbers to char arrays for easy manipulation
        char[] aChars = Integer.toString(a).toCharArray();

        // Try all possible permutations of the digits of a
        for (int i = 0; i < aChars.length - 1; i++) {
            for (int j = i + 1; j < aChars.length; j++) {
                // Swap the digits at positions i and j
                char temp = aChars[i];
                aChars[i] = aChars[j];
                aChars[j] = temp;

                // Convert back to integer and check if it's greater than b
                int newNumber = Integer.parseInt(new String(aChars));
                if (newNumber > b) {
                    return newNumber; // Found the smallest number greater than b
                }

                // Swap back to the original order for the next iteration
                temp = aChars[i];
                aChars[i] = aChars[j];
                aChars[j] = temp;
            }
        }

        // If no such number is found, return -1
        return -1;
    }
}

