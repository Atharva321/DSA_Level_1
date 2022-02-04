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
    int start = -1, end = -1; 
    while(low <= high){
        int mid = (low + high)/2;
        // if(arr[low] == arr[high]){
        //     break;
        // }

        if(d > arr[mid]){
            low = mid + 1;
        }
        else if(d < arr[mid]){
            high = mid - 1;
        }else{
            start = mid;
            high = mid - 1;
        }
    }
    System.out.println(start);
    low = 0; high = n-1;
    while(low <= high){
        int mid = (low + high)/2;
        // if(arr[low] == arr[high]){
        //     break;
        // }

        if(d > arr[mid]){
            low = mid + 1;
        }
        else if(d < arr[mid]){
            high = mid - 1;
        }
        else{
            end = mid;
            low = mid + 1;
        }
    }
    System.out.println(end);
    }
}
