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
    
    int[] ans = new int[l1 > l2? l1 : l2];
    
    int a1 = l1 - 1;
    int a2 = l2 - 1;
    int k = ans.length - 1;

    int carry = 0,d = 0;
    while(k>=0){
        d = carry;
        if(a1>=0){
            d+=arr1[a1];
        }
        if(a2>=0){
            d+=arr2[a2];
        }
        carry = d / 10;
        ans[k] = d % 10;
        a1--;
        a2--;
        k--;
        
    }
    if(carry > 0){
        System.out.println(carry);
    }
    for(int digit: ans){
        System.out.println(digit);
    }   
 }
}
