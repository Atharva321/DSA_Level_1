import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
     Scanner scn = new Scanner(System.in);
    int l1 = scn.nextInt();
    int[] arr1 = new int[l1];
    
    for(int i=0; i<l1; i++){
        arr1[i] = scn.nextInt();
    }
    int l2 = scn.nextInt();
    int[] arr2 = new int[l2];
    for(int i=0; i<l2; i++){
        arr2[i] = scn.nextInt();
    }
    
    int[] ans = new int[l2];
    
    int a1 = l1 - 1;
    int a2 = l2 - 1;
    int k = ans.length - 1;

    int carry = 0;

/**********************************

Always think about the case
 1 0 0 0
-      1
_________
   9 9 9

for this case we will make separate loop and check 
if the ans array conains leading zeroes or not.

**********************************/
    while(k>=0){
        int val = a1 >= 0? arr1[a1] : 0;
        if(arr2[a2] + carry >= val ){
            ans[k] = arr2[a2] + carry - val;
            carry = 0;
        }
        else{
            ans[k] = arr2[a2] + carry + 10 - val;
            carry = -1;
        }


        a1--;
        a2--;
        k--;
        
    }
    // if(carry > 0){
    //     System.out.println(carry);
    // }
    int index = 0;
    while(ans[index] == 0){
        index++;
    }
    while(index < ans.length){
        System.out.println(ans[index]);
        index++;
    }   
 }

}
