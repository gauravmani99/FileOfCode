// package Pattern;

import java.util.Scanner;

public class Swashtik {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number");
        int num=sc.nextInt();
        // getSimplePattern(num);
        getSwashtik( num);
    }
    public static void getSwashtik(int num){
        if(num%2==0){
            System.out.println("Enter the Odd Number!:");
            return;
        }
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==mid||j==mid||i==1&&j>mid||j==num&&i>mid||i==num&&j<mid||j==1&&i<mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
