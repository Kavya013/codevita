import java.util.Arrays;
import java.util.Scanner;
public class sort1 {
    static int[] array;
    static int[] array1;
    static int[] array2;
    static int sum = 0;
    static int swapping(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr[a] * arr[b];
    }
    static int prep() {
        for (int k = 0; k < array.length; k++) {
            for (int k2 = 0; k2 < array1.length; k2++) {
                if (array[k2] == array1[k]) {
                    if (k2 != k) {
                        int minIndex = Math.min(k, k2);
                        int maxIndex = Math.max(k, k2);
                        int swap1 = swapping(array, k2, k);
                        int swap2 = swapping(array2, 0, minIndex) + swapping(array2, minIndex, maxIndex)
                                + swapping(array2, 0, maxIndex);
                        if (swap1 < swap2) {
                            sum += swap1;
                            System.arraycopy(array, 0, array2, 0, array.length);
                        } else {
                            System.arraycopy(array1, 0, array2, 0, array1.length);
                            sum += swap2;
                        }
                    }
                    break;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt() - 1;
        array = new int[i];
        array1 = new int[i];
        array2 = new int[i];
        for (int k = 0; k < i; k++) {
            array[k] = sc.nextInt();
            array2[k] = array[k];
            array1[k] = array[k];
        }
        Arrays.sort(array1);
        int max = array1[array1.length - 1];
        for (int k = array1.length - 1; k > j; k--) {
            array1[k] = array1[k - 1];
        }
        array1[j] = max;
        System.out.println(prep());
    }
}

