package Recursion;

import java.util.Scanner;

public class getDigitSum {
  static   int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println(getDigitSum(num));
    }
    public static int getDigitSum(int num){
        int rem=0;
       
        if(num>0){
            rem=num%10;
            sum=sum+rem;
            return getDigitSum(num/10);
        }
        return sum;
    }
}
