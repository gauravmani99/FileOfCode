import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
      if(  checknum(num)){
        System.out.println("number is prime");
      }
      else
      System.out.println("not prime");

    }
    public static boolean checknum(int num){
        if(num<=1){
        return false;
        }
        if(num==2||num==3){
        return true;
        }
        if(num%2==0){
            return  false;
        }
        for(int i=3;i*i<=num;i=i+2){
             if(num%i==0){
             return false;
             }
        }
        return true;
    }
}
