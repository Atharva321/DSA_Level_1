import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt(); 
    int m1 = scn.nextInt();
    int[][] first = new int[n1][m1];
    for(int i=0; i<first.length;i++){
        for(int j=0; j<first[0].length; j++){
            first[i][j] = scn.nextInt();
        }
    }
    int n2 = scn.nextInt(); 
    int m2 = scn.nextInt();
    int[][] second = new int[n2][m2];
    for(int i=0; i<second.length;i++){
        for(int j=0; j<second[0].length; j++){
            second[i][j]=scn.nextInt();
        }
    }
    if(m1 != n2){
        System.out.println("Invalid Input");
        return;
    }
    int[][] product = new int[n1][m2];
    for(int i=0; i<product.length;i++){
        for(int j=0; j<product[0].length;j++){
            for(int k=0; k<m1;k++){
            product[i][j] += first[i][k]*second[k][j];
            }
        }
    }
    for(int i=0; i<product.length;i++){
        for(int j=0; j<product[0].length; j++){
            System.out.print(product[i][j] + " ");
        }
        System.out.println();
    }
 }

}
