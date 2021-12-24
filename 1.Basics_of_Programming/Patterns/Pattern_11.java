/*
=======================
Input:
5
Output:
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
=======================
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pattern_11{
    static class FastScanner{
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
    }
    public static void main(String[] args){
        FastScanner s = new FastScanner();
        int n = s.nextInt();
        int c = 1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(c + "\t");
                c++;
            }
            System.out.println();
        }
    }
}

