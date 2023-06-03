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
		    int k = sc.nextInt();
		    long x = 1;
		    while (n-->0) {
		        if (k<=0) {
		            break;
		        }
		        x = (x*k)%1000000007;
		        k--;
		    }
		    System.out.println(x);
		}
	}
}
