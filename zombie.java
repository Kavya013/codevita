import java.util.Scanner;

public class zombie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt(); // Number of test cases

        for (int k = 0; k < K; k++) {
            int N = scanner.nextInt(); // Total number of zombies
            int T = scanner.nextInt(); // Maximum time allowed
            int[] E = new int[N]; // Array representing energy of zombies

            for (int i = 0; i < N; i++) {
                E[i] = scanner.nextInt();
            }

            int P = scanner.nextInt(); // Initial player energy
            int D = scanner.nextInt(); // Minimum energy required to advance

            if (canAdvanceToNextLevel(N, T, E, P, D)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }

    private static boolean canAdvanceToNextLevel(int N, int T, int[] E, int P, int D) {
        for (int i = 0; i < N; i++) {
            if (P >= E[i]) {
                // Player wins the fight, gain energy and reduce time
                P += (P - E[i]);
                T--;
            }

            if (P >= D) {
                // Player has enough energy to advance
                return true;
            }

            if (T <= 0) {
                // Player ran out of time
                return false;
            }
        }

        // Player couldn't advance to the next level
        return false;
    }
}

