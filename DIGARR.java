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
		    int len = sc.nextInt();
		    int count = 0;
		    String digi = sc.next();
		    char[] digiarr = digi.toCharArray();
		    for (char ch: digiarr) {
		        if (ch == '0' || ch == '5') {
		            System.out.println("Yes");
		            count++;
		            break;
		        }
		    }
		    if(count == 0) {
		        System.out.println("No");
		    }
		}
	}
}
