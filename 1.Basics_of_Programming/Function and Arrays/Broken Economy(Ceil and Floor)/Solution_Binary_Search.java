import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    int d = scn.nextInt();
    int low = 0, high = n-1;
    while(low+1 != high){
        int mid = Math.abs((low + high)/2);
        if(arr[mid] < d){
            low = mid;
        }
        else if(arr[mid] > d){
            high = mid;
        }
    }
    System.out.print(arr[high] + "\n" + arr[low]);

 }

}
