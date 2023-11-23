import java.util.Scanner;

public class ascii {

    public static String isSuperASCII(String s) {
        // Initialize an array to store the frequency count of each character
        int[] frequency = new int[26];

        // Traverse the string and increment the frequency count of each character by 1
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        // Check if any character has non-zero frequency and is not equal to its ASCII value
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0 && frequency[i] != i + 1) {
                return "No";
            }
        }

        // If no such character is found, print "Yes"
        return "Yes";
    }

    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the input string is a super ASCII string
        String result = isSuperASCII(inputString);
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}


