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
    for(int j=0;j<matrix[0].length; j++){
        if(j%2==0){
            for(int i=0;i<matrix.length;i++){
                System.out.println(matrix[i][j]);
            }
        }
        else{
            for(int i=matrix[0].length-1;i>=0;i--){
                System.out.println(matrix[i][j]);
            }
        }
    }
 }

}
