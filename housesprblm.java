import java.util.Scanner;
public class housesprblm {

    static int prep(int hval[],int n) {
        if(n==0)
            return 0;
        if(n==1)
            return hval[0];
        if(n==2)
            return Math.max(hval[0],hval[1]);

        int[] dp = new int[n];
        dp[0]=hval[0];
        dp[1]=Math.max(hval[0],hval[1]);

        for (int i = 2; i < n; i++) {
            dp[i]=Math.max(hval[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int hval[] = {3,2,4,6,7,1};
        int n=hval.length;
        System.out.println("Max loot value :"+prep(hval,n));
    }

}