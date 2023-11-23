import java.util.Scanner;

public class bride
{

  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the row");
    int r = sc.nextInt ();
      System.out.println ("Enter the col");
    int c = sc.nextInt ();
    int fc = -1;		//bride with max no of qualities
    int fr = 1;			//position of best bride

    int fc1 = 1;		//position of best bride
    int[][] a = new int[r][c];
    int i;
    int j;
    for (i = 0; i < r; i++)
      {
	for (j = 0; j < c; j++)
	  {
	    a[i][j] = sc.nextInt ();
	  }
      }
    for (i = 0; i < r; i++)
      {
	for (j = 0; j < c; j++)
	  {
	    if (a[i][j] == 1)
	      {			//bride exists
		int cnt = 0;	//no of qualities
		if (j + 1 < c && a[i][j + 1] == 1)	//same row right
		  cnt++;
		if (j - 1 >= 0 && a[i][j - 1] == 1)	//same row left
		  cnt++;
		if (i + 1 < r)
		  {		//if you can go down
		    if (a[i + 1][j] == 1)	//bottom row
		      cnt++;
		    if (j + 1 < c && a[i + 1][j + 1] == 1)	//bottom row right
		      cnt++;
		    if (j - 1 >= 0 && a[i + 1][j - 1] == 1)	//bottom row left
		      cnt++;

		  }
		if (i - 1 >= 0)
		  {		//if you can go up
		    if (a[i - 1][j] == 1)	//top row
		      cnt++;
		    if (j + 1 < c && a[i - 1][j + 1] == 1)	//top row right
		      cnt++;
		    if (j - 1 >= 0 && a[i - 1][j - 1] == 1)	//top row left
		      cnt++;
		  }

		if (cnt > fc)
		  {		//if bride has most qualities..
		    fc = cnt;
		    fr = i;
		    fc1 = j;
		  }
		else if (cnt == fc)	//if bride has equal no of qualities compared to best bride..
		  {
		    if (Math.abs (fr - 1 + fc1 - 1) > Math.abs (i - 1 + j - 1))	//find if current bride has low distance
		      {
			fr = i;
			fc1 = j;

		      }
		  }

	      }
	  }
      }

    System.out.println ((fr + 1) + ":" + (fc1 + 1) + ":" + fc);
  }
}
