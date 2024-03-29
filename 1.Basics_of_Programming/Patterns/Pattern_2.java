// Time  : O(n^2)
// Space : O(1)
/*
=========================
Input: 4 

Output: 

*       *       *       *
*       *       *
*       *
*
=========================
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pattern_2{
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
						st=new StringTokenizer(br.readLine());				               
                    } catch (IOException e) {}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
    public static void main(String[] args){
        FastScanner s = new FastScanner();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j >  i; j--) {
                System.out.print("*\t");
            }
      System.out.println();
    }
    } 
}}

