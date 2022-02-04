import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tower_1 = scn.nextInt();
        int tower_2 = scn.nextInt();
        int tower_3 = scn.nextInt();
        toh(n, tower_1, tower_2, tower_3);
    }

    public static void toh(int n, int tower_1, int tower_2, int tower_3){
        if(n == 0){
            return;
        }
        toh(n-1, tower_1, tower_3, tower_2);

        System.out.println(n + "[" + tower_1 + " -> " + tower_2 + "]");

        toh(n-1, tower_3, tower_2, tower_1);  
    }

}
