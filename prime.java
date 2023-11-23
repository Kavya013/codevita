import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int D = scanner.nextInt();
        int P = scanner.nextInt();

        // Calculate and print the result
        int result = countEquivalentPrimeHours(D, P);
        System.out.println(result);
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int countEquivalentPrimeHours(int D, int P) {
        int hoursPerPart = D / P;
        int count = 0;

        for (int hour = 1; hour <= hoursPerPart; hour++) {
            if (isPrime(hour) && isPrime(hour + hoursPerPart)) {
                count++;
            }
        }

        return count;
    }
}
