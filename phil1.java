import java.util.Scanner;
public class phil1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();
        while (t > 0) {
            System.out.print("Enter the number: ");
            int n = scanner.nextInt();
            int result = calculateTotal(n);
            System.out.println("Denominations: " + result);
            t--; 
        }

        scanner.close();
    }
    private static int calculateTotal(int n) {
        return (int) Math.ceil(Math.log(n + 1) / Math.log(2));
    }
}

