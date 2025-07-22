package Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number A. ");
        int a=sc.nextInt();
        System.out.println("Enter the Number B. ");
        int b=sc.nextInt();
      System.out.println(  getPower(a,b));

    }
    public static int getPower(int a,int b){
        int pow=1;
         while(b>0){
             pow=pow*a;
             b--;
         }
         return pow;
    }
}
