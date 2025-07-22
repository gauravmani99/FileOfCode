import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int c=sc.nextInt();
        int big=a>b?a:b;
        int gcd=1;
        for(int i=1;i<big;i++){
            if(a%i==0&&b%i==0){
              gcd=i;
            }
        }
        int lcm=(a*b)/gcd;
        System.out.println(lcm);
    }
}
