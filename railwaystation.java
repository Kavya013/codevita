import java.util.*;

class railwaystation
{
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt ();
            b[i] = sc.nextInt ();
            b[i] = a[i] + b[i];
        } 
        Arrays.sort (a);
        Arrays.sort (b);
        int i = 1, j = 0, p = 1, q = 1;
        while (i < n && j < n)
        {
	        if (a[i] <= b[j])
        	{
                p++;
                i++;
            }
        	else if (a[i] > b[j])
    	    {
                p--;
                j++;
            }
            if (p > q)
                q = p;
        }
        System.out.println (q);
    }
}
