import java.util.Scanner;

public class try3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
    
      int sum=0;
      int num=1;
      while(num<=10){
           sum=sum+num;
           num++;
      }
      System.out.println(sum);
    }

}
