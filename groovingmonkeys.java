import java.util.Scanner;
public class groovingmonkeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of monkeys: ");
        int n = scanner.nextInt();
        int[] initialConfig = new int[n];

        System.out.println("Enter the initial configuration of monkeys:");
        for (int i = 0; i < n; i++) {
            initialConfig[i] = scanner.nextInt();
        }
        int swaps = findMinimumSwaps(initialConfig);
        System.out.println("Minimum number of swaps needed: " + swaps);
        scanner.close();
    }
    private static int findMinimumSwaps(int[] monkeys) {
        int swaps = 0;
        boolean[] visited = new boolean[monkeys.length];
        for (int i = 0; i < monkeys.length; i++) {
            if (!visited[i]) {
                int cycleSize = 0;
                int j = i;
                while (!visited[j]) {
                    visited[j] = true;
                    j = monkeys[j] - 1;
                    cycleSize++;
                }
                swaps += (cycleSize - 1);
            }
        }
        return swaps;
    }
}

