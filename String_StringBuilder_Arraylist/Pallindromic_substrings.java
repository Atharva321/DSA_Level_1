import java.io.*;
import java.util.*;

public class Main {

	public static boolean solution(String str){
		//write your code here
		int left = 0;
		int right = str.length() - 1;
		boolean flag =true;
		while(left < right){
		    if(str.charAt(left)!= str.charAt(right)){
		        flag = false;		        
		        break;
		    }
		    left++;
		    right--;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		for(int i=0;i<=str.length(); i++){
		    for(int j=i+1; j<=str.length(); j++){
		        if(solution(str.substring(i,j)) == true){
		            System.out.println(str.substring(i,j));
		        }
		    }
		}
		
	}

}
