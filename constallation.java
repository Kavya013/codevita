import java.util.*;
import java.io.*; 
  
public class constallation {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		char a[][] = new char[3][n];
		for(int i=0;i<3;i++) {
			a[i] = sc.next().toCharArray();
		}
		StringBuilder res = new StringBuilder();
		int i = 0;
		while(i<n) {
			if(a[0][i] == '#') {
				res.append("#");
				i++;
			}
			else {
				if(a[0][i+1]=='*' && a[1][i+1]=='*' && a[2][i+1]=='.') {
					res.append("A");
				}
				else if(a[0][i+1]=='.' && a[1][i+1]=='.' && a[2][i+1]=='*') {
					res.append("U");
				}
				else if(a[0][i+1]=='*' && a[1][i+1]=='.' && a[2][i+1]=='*') {
					res.append("O");
				}
				else {
					if(a[0][i]=='*' && a[1][i]=='.' && a[2][i]=='*') {
						res.append("I");
					}
					else {
						res.append("E");
					}
				}
				i += 3;
			}
		}
		System.out.println(res);
	}
}
