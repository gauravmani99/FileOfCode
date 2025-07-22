package Number;
import java.util.Scanner;
public class DisNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();   
        if(isArmstrong(num)){
            System.out.println( "yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static boolean isArmstrong(int num){
        int originalNumber=num;
        int rem;
        int count=3;
        int sum=0;
        while(num>0){
            rem=num%10;
              
           sum=sum+ getpower(rem,count);
           count--;
            num=num/10;
        }
        return originalNumber==sum;
    }
    public static int getpower(int num, int power) {
        return (int) Math.pow(num, power);
    }
}
