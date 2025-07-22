package Recursion;


import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(getBinary(num));
    }
    public static String getBinary(int num){
        int rem=0;
        String val="";
        while(num>0){
                 rem=num%2;
                 val=val+rem;
                 num=num/2; 
        }
        return val;
    }
}
