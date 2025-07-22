package Number;

import java.util.Scanner;

public class nthpalindromNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entert the nth tearm: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1 ;;i++){
            if(ispalindrom(i)){
                count++;
                if(count==num){
                    System.out.println(i);
                    break;
                }
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
