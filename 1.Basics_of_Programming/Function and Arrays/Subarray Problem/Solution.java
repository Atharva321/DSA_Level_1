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
    for(int i=0; i < n; i++){
        int cnt = i;
        while(cnt != n){
            for(int j=i; j<=cnt; j++){
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
            cnt++;
        }
    }
 }

}
