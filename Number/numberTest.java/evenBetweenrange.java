package numberTest.java;

import java.util.Scanner;

public class evenBetweenrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("enter the first range");
        int a=sc.nextInt();
        System.out.println("Enter the second range ");
        int b=sc.nextInt();
        printEven(a,b);

    }
    public static  void printEven(int a,int b){
        for(int num=a;num<=b;num++){
            if(num%2==0)
            System.out.println(num);
        }
    }
}
