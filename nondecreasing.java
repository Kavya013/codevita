import java.util.Scanner;

public class nondecreasing {

    // Function to calculate the count of non-decreasing numbers without dynamic programming
    public static int countNonDecreasingNumbers(int n) {
        // Calculate the count using combinations
        int count = 10; // For single-digit numbers

        for (int i = 1; i < n; i++) {
            count *= (10 + i);
            count /= i;
        }

        return count;
    }

    public static void main(String[] args) {
        // Input the number of digits
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of digits (n): ");
        int n = scanner.nextInt();

        // Calculate and display the result
        int result = countNonDecreasingNumbers(n);
        System.out.println("Count of non-decreasing numbers with " + n + " digits: " + result);
    }
}


