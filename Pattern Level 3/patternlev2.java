// package Pattern Level 2;
import java.util.Scanner;
 class patternlev2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        printPattern(num);
    }
    public static void printPattern(int num){
        int star=1;
        int spac=num-1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=spac;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            spac --;
            star++;
            System.out.println();
        }
    }
}
