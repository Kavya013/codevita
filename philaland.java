import java.io.*;
class prblm1
{
	static int findMinDenomin(int n) 
	{
		return ((int)(Math.log(n)/Math.log(2))+1);
	}
	public static void main (String[] args) 
	{
		int n = 10;
		System.out.println(findMinDenomin(n));
	}
}

