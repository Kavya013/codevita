import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] array;
    static int sum = 0;

    static int swapping(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr[a] * arr[b];
    }

    static int prep(int j) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                int k2 = i;
                int k = array[i] - 1;
                int minIndex = Math.min(k, k2);
                int maxIndex = Math.max(k, k2);

                int swap1 = swapping(array, k2, k);
                int swap2 = swapping(array, 0, minIndex) + swapping(array, minIndex, maxIndex)
                        + swapping(array, 0, maxIndex);

                if (swap1 < swap2) {
                    sum += swap1;
                } else {
                    swapping(array, k2, k);
                    sum += swap2;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = sc.nextInt() - 1;
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        int max = array[array.length - 1];

        for (int i = array.length - 1; i > j; i--) {
            array[i] = array[i - 1];
        }

        array[j] = max;

        System.out.println(prep(j));
    }
}

