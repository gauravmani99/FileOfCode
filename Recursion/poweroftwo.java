package Recursion;

import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(getisPowerOfTwo(num)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static boolean getisPowerOfTwo(int num){
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num%2!=0)
        return false;
        return getisPowerOfTwo(num/2);
    }
}
