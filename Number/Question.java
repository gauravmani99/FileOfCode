import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number A,B,C");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
    
       
        System.out.println( getLcm(getLcm(A,B),C));
    }
    public static int getLcm(int a,int b){
          int big=a>b?a:b;
          for(int i=big; ;i+=big){
            if(i%a==0&&i%b==0)
            return i;
          }
    }
   
}
