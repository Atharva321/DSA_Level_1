// Time  :
// Space :

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){
            return;
        }
        //Prearea of recursion
        System.out.println(n);
        pdi(n-1);
      
        //Postarea of recursion
        System.out.println(n);
    }

}
