package  Number;
import java.util.Scanner;

public class testprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("Enter the Number");
        int num2=sc.nextInt();
        for(int i=num;i<=num2;i++){
      if(  isprime(i)){
        System.out.println("number is prime "+i);
      }
      else
      System.out.println("number is not Prime");
    }
    }
    public static boolean isprime(int num){
        if(num==1)
        return true;
        if(num==2||num==3)
        return true;
        if(num%2==0)
        return false;
      for(int i=3;i*i<=num;i++){
        if(num%i==0)
        return false;
      }
      return true;
    }
}
