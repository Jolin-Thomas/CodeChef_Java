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
		    int temp = n;
		    int count = 0;
		    while ((n%10) == 9) {
		        count++;
		        n/=10;
		    }
		    if(count%2 == 1) {
		        System.out.println(temp+2);
		    }
		    else {
		        System.out.println(temp+1);
		    }
		}
		
	}
}
