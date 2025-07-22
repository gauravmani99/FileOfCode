package Number;

import java.util.Scanner;

public class countprime {
    public static boolean isPrime(int num){
       if(num<=1){
        return false;
       }
       if(num==2||num==3){
        return true;
       }
       if(num%2==0){
        return false;
       }
       for (int i = 3; i*i <num; i++) {
           if(num%i==0)
           return false;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start");
        int num=sc.nextInt();
        System.out.println("Enter the End");
        int end=sc.nextInt();
        int count=0;
         for(int i=num;i<=end;i++){
        if(isPrime(i)){
           count++;
        }
    }
    System.out.println(count);
}

}
