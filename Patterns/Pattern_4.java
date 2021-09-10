import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pattern_4{
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
    /* there is difference between print() and println() the first print will print text without new line and second one will print text with new line*/
    
        for (int i = 0; i < n; i++) {
            for (int j = n; j >=  i; j--) {
                System.out.print("*\t");
            }
      System.out.println();
    }
    } 
}}

