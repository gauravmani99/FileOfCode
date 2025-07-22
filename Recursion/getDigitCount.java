package Recursion;
import java.util.Scanner;
public class getDigitCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(getDigitCount(num));
        // System.out.println(getDigitCount(num)); 
    }
    public static int getDigitCount(int num){
        int rem=0;
        int count=0;
        if(num>0){
            num=num%10;
          count++;
          num=num/10;
        }
        return count;
    }
}
