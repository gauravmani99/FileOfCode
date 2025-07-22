
import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        System.out.println(getHcf(getHcf(A,B),C));
    }
    public static int getHcf(int a,int b){
        int small=a<b?a:b;
        for(int i=small; ;i--){
            if(a%i==0&&b%i==0)
            return i;
        }
    }
}
