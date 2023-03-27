// Time  : O(n)
// Space : O(n)

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
        
    }

    public static void pzz(int n){
        if(n==0) return;
        
        //Pre
        System.out.print(n + " ");
        pzz(n-1);
        
        //In
        System.out.print(n + " ");
        pzz(n-1);
        
        //Post
        System.out.print(n + " ");
    }

}
