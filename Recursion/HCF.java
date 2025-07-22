package Recursion;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the Number 2");
        int num2=sc.nextInt();
      System.out.println(  getHCF(num1,num2));
    }
    public static int getHCF(int a,int b){
        int small=a<b?a:b;
        for(int i=small;;i--){
            if(a%i==0&&b%i==0)
            return i;
        }
    }
}
