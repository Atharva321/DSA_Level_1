import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		String str1 = "";
		int count = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.length()==1){
                return str;
            }
            if(str.charAt(i)!=str.charAt(i+1)){
                str1+=str.charAt(i);
            }
            else if(str.charAt(i) == str.charAt(i+1) && i+1 == str.length()-1){
                str1+=str.charAt(i);
            } if(str.charAt(i) != str.charAt(i+1) && i+1 == str.length()-1){
                str1+=str.charAt(i+1);
            } 
        }
        return str1;
	}

	public static String compression2(String str){
		// write your code here
		String str2 = "";
		int count =1;
		if(str.length()==1){
                return str;
            }
         for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1) && count > 1){
                str2+=str.charAt(i) + Integer.toString(count);
                count=0;
            }
            else if(str.charAt(i)!=str.charAt(i+1) && count <= 1){
                str2+=str.charAt(i);
                count = 0;
            }else if(str.charAt(i) == str.charAt(i+1) && i+1 == str.length()-1){
                count++;
                str2+=str.charAt(i)+Integer.toString(count);
                count = 0;
            }
            if(str.charAt(i) != str.charAt(i+1) && i+1 == str.length()-1){
                str2+=str.charAt(i+1);
            }
            count++;
            
        }

		return str2;
	}
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
