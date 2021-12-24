import java.util.*;
  
  public class Decimal_To_Any_Base{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int rem = 0;
       int c = 0;
       int sum =0;
       int power = 1;
       while(n>0){
           rem = n%b;
           n = n/b;
           sum += rem*power;
           power *= 10;
       }
       return sum;
   }
  }
