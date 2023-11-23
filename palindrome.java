import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    public static void findPalindrome(String str) {
        int len = str.length();
        for (int i = 1; i < len - 1; i++) {
            String s1 = str.substring(0, i);
            if (isPalindrome(s1)) {
                for (int j = 1; i + j < len; j++) {
                    String s2 = str.substring(i, i + j);
                    String s3 = str.substring(i + j);
                    if (isPalindrome(s2) && isPalindrome(s3)) {
                        System.out.println(s1);
                        System.out.println(s2);
                        System.out.println(s3);
                        return;
                    }
                }
            }
        }
        System.out.println("Impossible");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        findPalindrome(s);
        sc.close();
    }
}
