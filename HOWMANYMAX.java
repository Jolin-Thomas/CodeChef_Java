/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
		    int n = sc.nextInt();
		    String bs = sc.next();
		    char[] chbs = bs.toCharArray();
		    int count = 0;
		    if (chbs[0] == '1') {
		        count++;
		    }
		    if (chbs[n-2] == '0') {
		        count++;
		    }
		    for (int i = 0; i<n-2; i++) {
		        if (chbs[i] == '0' && chbs[i+1] == '1') {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
