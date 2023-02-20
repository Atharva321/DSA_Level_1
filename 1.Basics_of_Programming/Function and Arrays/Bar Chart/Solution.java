// Time  : O(n^2)
// Space : O(n^2)

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
    }
    int star = max;
    for(int i=0; i<max; i++){
        for(int j=0; j<arr.length; j++){
            if(arr[j]>=star){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        star--;
        System.out.println();
    }
 }

}
