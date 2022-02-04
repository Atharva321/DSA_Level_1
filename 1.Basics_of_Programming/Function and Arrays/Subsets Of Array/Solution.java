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
    //Math.pow returns in double
    int nset = (int)Math.pow(2, n);
    for(int i=0; i < nset; i++){
        String s = "";
        int temp = i;
        for(int j= n - 1; j >= 0; j--){
            int r = temp % 2;
            temp /= 2;
            if(r == 0){
                s = "-\t" + s;
            }
            else{
                s = arr[j] + "\t" + s;
            }
        }
        System.out.println(s);
    }
 }

}
