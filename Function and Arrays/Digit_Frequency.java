/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
------------------------
Input:
A number n
A digit d
------------------------
Output:
A number representing frequency of digit d in number n
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Digit_Frequency{
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
	}
    public static void main(String[] args){
        FastScanner scanner = new FastScanner();
        int number = scanner.nextInt();
        int digit  = scanner.nextInt();

        System.out.println(digit_frequency_counter(number, digit));
    }
    public static int digit_frequency_counter(int num, int digit){
        int frequency_of_digit = 0;    
  //logic: check reminder of number is equal to given digit
  //       if its equal to digit then increase the frequency variable
  //       then reduce the number digits by 1 by dividing it by 10
        while(num>0){
                int rem = num % 10;
                num = num / 10;
                if(rem == digit){
                    frequency_of_digit++;
                }
            }
            return frequency_of_digit;
    }
}
/* 
===============================================
Input:
74727
7
-----------------------------------------------
Output:
3
===============================================
*/