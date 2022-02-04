import java.io.*;
import java.util.*;

public class Solution{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max=0;
    int min=Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();
        if(max < arr[i]){
            max = arr[i];
        }
        if(min > arr[i]){
            min = arr[i];
        }
    }
    System.out.println(max - min);
 }

}
