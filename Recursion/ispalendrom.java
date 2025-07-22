package Recursion;

import java.util.Scanner;

public class ispalendrom {
    static int rev=0;
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int orignalnum=num;
       if(ispalendrom(num)==orignalnum){
        System.out.println("yes");
       }
       else{
        System.out.println("no");
       }
    }
    public static int ispalendrom (int num){
        if(num>0){
            rev=rev*10+num%10;
           return ispalendrom(num/10);
        }
        return rev;
    }
}
