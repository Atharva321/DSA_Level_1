// Time  : O(nlogn) 
// Space : O(n)

import java.io.*;
import java.util.*;

public class Solution{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int  n = scn.nextInt();
    int[] nums = new int[n]; 
    for(int i = 0; i < n; i++ ){
        nums[i] = scn.nextInt();
    }
    
    Arrays.sort(nums);
    
    HashMap<Integer, Integer> hmap = new HashMap<>();
    for(int i = 0; i < n; i++ ){
        hmap.put(nums[i],i);
    }
    int num = 0, max = 1, start = 0;
    for(int i = 0; i< n; i++){
        if(!hmap.containsKey(nums[i]-1)){
            start = nums[i];
            int  j = i, length = 0;
            while(hmap.containsKey(start+length)){
                length++;
                j++;
            }
            if(max < length){ 
                max = length;
                num = nums[i];   
            }   
        }
    }
    for(int i = num; i < max+num; i++ ){
        System.out.println(i);
    }
 }
}
