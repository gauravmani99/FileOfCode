package Recursion;

public class numberfrom10to1 {
    public static void main(String[] args) {
        test(10);
    }
    public static void test(int n){
          if(n>=1){
            System.out.println(n);
            test( n-1);
          }
    }
}
