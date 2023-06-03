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
		while(t-->0) {
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int V = sc.nextInt();
		    int sum = 0;
		     
		    for (int i = 0; i<N; i++) {
		        sum += sc.nextInt();
		    }
		     
		    int res = ((N+K)*V)-sum;
		    int ans = res/K;
		     
		    if (ans<=0) {
		        System.out.println(-1);
		    }
		    else if (res%K != 0) {
		        System.out.println(-1);
		    }
		    else {
		        System.out.println(ans);
		    }
		}
	}
}
