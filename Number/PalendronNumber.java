package Number;

import java.util.Scanner;

public class PalendronNumber {
    public static boolean  ispalendrom(int num){
            int originalNum = num; 
            int rev = 0;
            while (num > 0) {
                rev = rev * 10 + num % 10; 
                num = num / 10;
            }
            return rev == originalNum;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number");
        int num=sc.nextInt();
       if(ispalendrom(num)){
        System.out.println("numper is palindrom");
       }
       else{
        System.out.println("numper is not palindrom ");
       }
    }
}
