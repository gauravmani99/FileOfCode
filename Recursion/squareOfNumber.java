package Recursion;

public class squareOfNumber {
  static   int sum=0;
    public static void main(String[] args) {
        test(1);
       
    }
   
    public static void test(int num){
        int sum=1;
        if(num<=100){
           sum = num*num;
           System.out.println(sum);
          test(num+1);
        }
      
    }
}



