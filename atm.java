import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int withdrawalAmount = scanner.nextInt();
        int note100 = scanner.nextInt();
        int note200 = scanner.nextInt();
        int note500 = scanner.nextInt();
        int note1000 = scanner.nextInt();
        int maxCount = scanner.nextInt();

        int result = maxCurrencyNotes(N, withdrawalAmount, note100, note200, note500, note1000, maxCount);
        System.out.println(result);
    }

    static int maxCurrencyNotes(int N, int withdrawalAmount, int note100, int note200, int note500, int note1000, int maxCount) {
        int totalAmount = withdrawalAmount;
        int count = 0;

        while (totalAmount > 0 && count < N && count < maxCount) {
            if (totalAmount >= 1000 && note1000 > 0) {
                totalAmount -= 1000;
                note1000--;
            } else if (totalAmount >= 500 && note500 > 0) {
                totalAmount -= 500;
                note500--;
            } else if (totalAmount >= 200 && note200 > 0) {
                totalAmount -= 200;
                note200--;
            } else if (totalAmount >= 100 && note100 > 0) {
                totalAmount -= 100;
                note100--;
            } else {
                break;
            }

            count++;
        }

        return (totalAmount == 0) ? count : 0;
    }
}

