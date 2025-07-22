package Number;

import java.util.Scanner;

public class primeornot2 {
    public static boolean isprimeornot(int num){
       if(num<=1)
       return false;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isprimeornot(num)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
}
    }


