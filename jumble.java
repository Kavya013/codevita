import java.util.Scanner;

public class jumble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int m = scanner.nextInt();

        if (isValidInput(t1, t2)) {
            int result = findMathewJohnNumber(t1, t2, m);
            System.out.println(result != -1 ? String.valueOf(result) : "No number is present at this index");
        } else {
            System.out.println("Invalid Input");
        }

        scanner.close();
    }

    private static boolean isValidInput(int t1, int t2) {
        return 0 < t1 && t1 < t2 && t2 < 1000000;
    }

    private static int findMathewJohnNumber(int t1, int t2, int m) {
        for (int i = t1; i <= t2; i++) {
            int mathewNum = calculateMathewNumber(i);
            int johnNum = calculateJohnNumber(i);

            if (mathewNum == johnNum) {
                m--;
                if (m == 0) {
                    return mathewNum;
                }
            }
        }

        return -1; // No number is present at this index
    }

    private static int calculateMathewNumber(int n) {
        return n * (2 * n - 1);
    }

    private static int calculateJohnNumber(int n) {
        return n * (n + 1) / 2;
    }
}

