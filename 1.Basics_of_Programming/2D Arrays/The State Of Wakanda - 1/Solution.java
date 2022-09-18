import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int m1= scn.nextInt();
    int n1 = scn.nextInt();
    int[][] arr1 = new int [m1][n1];
    for(int i=0; i<m1; i++){
        for(int j=0; j<n1; j++){
            arr1[i][j] = scn.nextInt();
        }
    }
    int counter = m1*n1;
    int row = 0, column = 0,up=0;
    while(counter>0 && (row < m1 && column < n1)){
        if((row == 0 && up == 1) || (row==m1 -1 && up == 0)){
            System.out.println(arr1[row][column] + " ");
            counter--;
            column++;
            if(up == 1){
                up = 0;
            }
            else{
                up = 1;
            }
        }
        if(up == 1 && column < n1 ){
            System.out.println(arr1[row][column] + " ");
            row--;
            counter--;
        }
        else if(up == 0 && column < n1){
            counter--;
            System.out.println(arr1[row][column] + " ");
            row++;
            
        }
        
    }
 }

}
