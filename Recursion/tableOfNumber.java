package Recursion;

import java.util.Scanner;

public class tableOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        test(num,1);
    }
    public static void test(int num,int i){
       
        if(i<=10){
            System.out.println(num*i);
           test(num,i+1);
        }
    }
}
