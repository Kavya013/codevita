import java.util.Scanner;

public class countingrock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rock samples and ranges
        int numSamples = scanner.nextInt();
        int numRanges = scanner.nextInt();

        // Input rock sample sizes
        int[] samples = new int[numSamples];
        for (int i = 0; i < numSamples; i++) {
            samples[i] = scanner.nextInt();
        }

        // Input and process ranges
        for (int i = 0; i < numRanges; i++) {
            int minRange = scanner.nextInt();
            int maxRange = scanner.nextInt();

            // Count samples in the current range
            int count = countSamplesInRange(samples, minRange, maxRange);

            // Output the count
            System.out.print(count);

            // Add space if it's not the last range
            if (i < numRanges - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }

    private static int countSamplesInRange(int[] samples, int minRange, int maxRange) {
        int count = 0;
        for (int sample : samples) {
            if (sample >= minRange && sample <= maxRange) {
                count++;
            }
        }
        return count;
    }
}

