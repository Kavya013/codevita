import java.util.ArrayList;
import java.util.Scanner;

public class chakravyuha
{
  public static void main (String[]args)
  {
    Scanner scr = new Scanner (System.in);
    int n = scr.nextInt ();
    int a[][] = new int[n][n];
    int lc = 0;
    int lr = 0;
    int hc = a[0].length - 1;
    int hr = a.length - 1;
    int pp = 1;
    int nel = (hc + 1) * (hr + 1);
    int ct = 1;
      ArrayList < Integer > al = new ArrayList <> ();
      al.add (0);
      al.add (0);
    while (lc < hc && lr < hr)
      {
	for (int i = lc; i <= hc && ct <= nel; i++)
	  {
	    a[lr][i] = ct;
	    if (a[lr][i] % 11 == 0)
	      {
		pp++;
		al.add (lr);
		al.add (i);
	      }
	    ct++;
	  }
	lr++;
	for (int i = lr; i <= hr && ct <= nel; i++)
	  {
	    a[i][hc] = ct;
	    if (a[i][hc] % 11 == 0)
	      {
		pp++;
		al.add (i);
		al.add (hc);
	      }
	    ct++;
	  }
	hc--;
	for (int i = hc; i >= lc && ct <= nel; i--)
	  {
	    a[hr][i] = ct;
	    if (a[hr][i] % 11 == 0)
	      {
		pp++;
		al.add (hr);
		al.add (i);
	      }
	    ct++;
	  }
	hr--;
	for (int i = hr; i >= lr && ct <= nel; i--)
	  {
	    a[i][lc] = ct;
	    if (a[i][lc] % 11 == 0)
	      {
		pp++;
		al.add (i);
		al.add (lc);
	      }
	    ct++;
	  }
	lc++;
      }
    for (int i = 0; i < n; i++)
      {
	for (int j = 0; j < n; j++)
	  {

	    System.out.print (a[i][j] + " ");
	  }
	System.out.println ();
      }
    System.out.println ("Total Power points :" + pp);
    for (int i = 0; i < al.size (); i += 2)
      {
	System.out.println ("(" + al.get (i) + "," + al.get (i + 1) + ")");
      }
  }
}
