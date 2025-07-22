import java.util.Scanner;

public class lcmInMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("LCM is: " + getLcm(getLcm(a, b), c));
    }
    public static int getLcm(int a,int b,int c){
        int big = (a > b && a > c) ? a : (b > c ? b : c);
        int gcd=1;
        for(int i=1;i<big;i++){
            if(a%i==0&&b%i==0&&c%i==0){
              gcd=i;
            }
        }
        System.out.println(gcd);
        int lcm=(a*b*c)/gcd;
        return lcm;
    }
}
