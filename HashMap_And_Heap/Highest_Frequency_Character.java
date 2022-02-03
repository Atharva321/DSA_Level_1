import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str  = scn.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        char ans = '0';
        int  max = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int old_frequency = map.get(ch);
                int new_frequency = old_frequency + 1;
                map.put(ch, new_frequency);
                if(max < new_frequency){
                    ans = str.charAt(i);
                    max = new_frequency;
                }

            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(ans);
    }
}
