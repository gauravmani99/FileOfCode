package Recursion;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number1");
        int num=sc.nextInt();
        System.out.println("Enter the Number2");
        int num2=sc.nextInt();
       System.out.println( getLCM(num,num2));
    }
    public static int getLCM(int a,int b){
      int big=a>b?a:b;
      for(int i=big;;i+=big){
        if(i%a==0&&i%b==0)
        return i;
      }
    }
}
