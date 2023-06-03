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
		    int N = sc.nextInt();
		    int Y = sc.nextInt();
		    int[] arr = new int[N];
		    int or = 0;
		    
		    for (int i = 0; i<N; i++)
		        or |= sc.nextInt();
		        
		    int val = Y ^ or;
		    
		    if((val | or) == Y) {
		        System.out.println(val);
		    }
		    else {
		        System.out.println(-1);
		    }
		}
	}
}
