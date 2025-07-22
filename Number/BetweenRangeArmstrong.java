package Number;

import java.util.Scanner;
public class BetweenRangeArmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start number");
        int num=sc.nextInt();
        System.out.println("Enter the  End number");
        int end=sc.nextInt();
            for(int i=num;i<=end;i++)
        if(isArmstrong(i)){
            System.out.println( + i);
        }
    }
    public static boolean isArmstrong(int num){
        int originalNumber=num;
        int rem=0;
        int count=0;
        int sum=0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        num = originalNumber;
        while(num>0){
            rem=num%10;
           sum=sum+ getpower(rem,count);
            num=num/10;
        }
        return originalNumber==sum;
    }
    public static int getpower(int num, int power) {
        return (int) Math.pow(num, power);
    }
}
