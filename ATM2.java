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
		
		for (int i = 0; i<t; i++) {
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    while (N != 0 ) {
		        int p = sc.nextInt();
		        if(K >= p) {
		            K-=p;
		            System.out.print(1);
		        }
		        else {
		            System.out.print(0);
		        }
		        N--;
		    }
		    System.out.println();
		}
	}
}
