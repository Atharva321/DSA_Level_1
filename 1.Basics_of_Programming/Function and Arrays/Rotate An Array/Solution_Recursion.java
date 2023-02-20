// Time  : O(n)
// Space : O(1)

import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  
  public static void reverse(int[] a,int i, int j ){
    int temp = 0;
    while(i < j){
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }
  }
  public static void rotate(int[] a, int k){
    // write your code here
    k %= a.length;
    
    if(k<0){
      k += a.length;
    }
    // reversing the first part
     reverse(a,    0,            a.length - k - 1);
     
     //reversing the second part
     reverse(a,    a.length - k, a.length -1);
     
     //reversing the whole array as it will be answer.
     reverse(a,    0,            a.length - 1);     
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
