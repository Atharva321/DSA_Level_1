import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(1, n);
    }

    public static int printIncreasing(int num, int n){
        if(num == n){
            System.out.println(num);
            return 0;
        }
        System.out.println(num);
        return printIncreasing(num+1, n);
    }
}
