import java.util.*;
public class primeconstruction {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static int findlcm(ArrayList< Integer> arr, int n) {
        int ans = arr.get(0);
        for (int i = 1; i < n; i++)
            ans = (((arr.get(i) * ans)) / (gcd(arr.get(i), ans)));
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList< Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            v.add(t);
        }
        int a = Collections.min(v);
        int index = v.indexOf(a);
        if (index != -1)
            v.remove(index);
        int res = findlcm(v, n - 1);
        System.out.println(res + a);
        scanner.close();
    }
}
