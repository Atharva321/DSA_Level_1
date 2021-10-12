import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int row = scn.nextInt();
    int column = scn.nextInt();
    int[][] matrix = new int[row][column];
    for(int i=0;i<matrix.length;i++){
        for(int j=0; j<matrix[0].length; j++){
            matrix[i][j]=scn.nextInt();
        }
    }
    //flag: 0 => down 1=>up
    int flag =0;
    int r=0;
    int c=0;
    
    while(c < column){
        if(flag == 1){
            while(r>=0){
            System.out.println(matrix[r][c]);
            r--;
            if(r<0){
                flag=0;
            }
            }
        }
        else{
            while(r<row){
            System.out.println(matrix[r][c]);
            r++;
            if(r==row){
                flag=1;
            }
            }
        }
        c++;
    }

    
 }

}
