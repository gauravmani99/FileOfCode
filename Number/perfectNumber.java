package Number;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isPerfectNumber(num)){
            System.out.println("Number is Perfect");
        }
        else{
            System.out.println("not perfect");
        }
    }
    public static boolean isPerfectNumber(int num){
        int sum=0;
        int orignalNumber=num;
       for(int i=1;i<num;i++){
        if(num%i==0){
            sum=sum+i;
        }
       }
       return sum==orignalNumber;
    }
}
