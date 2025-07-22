
import java.util.Scanner;

   public class NumberPatter5{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    printpattern1(num);
  }
  public static void printpattern1(int num){
    int space=0;
    int star=num;
    for (int i = 1; i <=num; i++) {
        for(int j=1;j<=space;j++)
        System.out.print("  ");
        for(int j=1;j<=star;j++)
        System.out.print(i%2+" ");
        star--;
         space++;
         System.out.println();
    }
  }
}

// 1 1 1 1 1 
  // 0 0 0 0
  // 1 1 1
  //   0 0
  //     1