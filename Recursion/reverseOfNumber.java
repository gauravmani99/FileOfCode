package Recursion;

import java.util.Scanner;

public class reverseOfNumber {
    static int rev=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println(getReverse(num));
    }
    public static int getReverse (int num){
        int rem=0;
        if(num>0){
            rev=rev*10+num%10;
           return getReverse(num/10);
        }
        return rev;
    }
}
