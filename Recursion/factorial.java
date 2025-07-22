package Recursion;

import java.util.Scanner;

public class factorial {
    static int fact=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=1;
        getFactorial(num,i);
       

    }
    public static void  getFactorial(int num, int i){
        if(i<=num){
            fact=fact*i;
            System.out.println(fact);
            getFactorial(num, i+1);
        }
       
    }
    
}
