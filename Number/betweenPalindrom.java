package Number;

import java.util.Scanner;

public class betweenPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entert the Start point");
        int str=sc.nextInt();
        System.out.println("Entert the End point");
        int end=sc.nextInt();
        for(int i=str;i<=end;i++){
            if(ispalindrom(i)){
                System.out.println(i);
               
            }
        }
    }
    public static boolean ispalindrom(int num){
        int originalNum=num;
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev==originalNum;
    }
}
