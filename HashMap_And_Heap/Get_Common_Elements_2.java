Time  : O(n)

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
    // write your code here
        Scanner scn = new Scanner(System.in);
        int a1_len = scn.nextInt();
        int[] n1 = new int[a1_len];
        for(int i=0; i<a1_len;i++){
            n1[i] = scn.nextInt();
        }
        int a2_len = scn.nextInt();
        int[] n2 = new int[a2_len];
        for(int i=0; i<a2_len;i++){
            n2[i] = scn.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n1.length; i++) {
            if(map.containsKey(n1[i])){
                int old_frequency = map.get(n1[i]);
                int new_frequency = old_frequency + 1;
                map.put(n1[i],new_frequency);
            } else{
                map.put(n1[i],1);
            }
        }
        // here we decrease frequency of element each time
        // when we print so that it will only print intersection
        for(int val: n2){
            if(map.containsKey(val) && map.get(val) > 0){
                System.out.println(val);
                map.put(val, map.get(val)-1);
            }
        }
    }

}
