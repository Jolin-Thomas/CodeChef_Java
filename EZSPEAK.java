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
		    int size = sc.nextInt();
		    String word = sc.next();
		    char[] word2 = word.toCharArray();
		    int count = 0;
		    for (char ch: word2) {
		        if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
		            count++;
		        }
		        else {
		            count = 0;
		        }
		        if (count == 4) {
		            System.out.println("NO");
		            break;
		        }
		    }
		    if (count < 4) {
		        System.out.println("YES");
		    }
		    
		}
	}
}
