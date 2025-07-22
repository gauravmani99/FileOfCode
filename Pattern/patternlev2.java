import java.util.Scanner;

public class patternlev2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        printPattern(num);
    }
    public static void printPattern(int num){
        int star=1;
        int space=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            star++;
            System.out.println();
        }
    }
}
