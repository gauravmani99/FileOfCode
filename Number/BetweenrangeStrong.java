package Number;

import java.util.Scanner;

public class BetweenrangeStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int count=0;
        for(int i=100;i<=num;i++)
        if(isStrongNumber(i)){
            System.out.println("Number is Strong "+i);
                  count++;
        }
        System.out.println(count);
       
    }
    public static boolean isStrongNumber(int num){
        int rem=1;
        int originalNumber=num;
        int sum=0;
        while(num>0){
            rem=num%10;
             sum=sum+getfactorial(rem);
             num=num/10;
        }
        return originalNumber==sum;
    }
    public static int getfactorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
             fact=fact*i;
        }
        return fact;
    }
}
