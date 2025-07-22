package Recursion;

public class SumofSquare {
  static   int sum=0;
    public static void main(String[] args) {
        test(1);
        System.out.println(test(sum));
    }
   
    public static int test(int num){
        if(num<=100){
           sum = sum+(num*num);
          test(num+1);
        }
       return sum;
    }
}



