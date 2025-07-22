package Recursion;
import java.util.Scanner;
public class countTheDigits {
   static  int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the Number");
        // int num=sc.nextInt();
        System.out.println(getDigitCount(85214));
    }
    public static int getDigitCount(int num){
        
        int rem=0;
      if(num>0){
      rem=num%10;
      count++;
     return getDigitCount(num/10);
      }
       return count;
    }
}
