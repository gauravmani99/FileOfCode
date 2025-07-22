
import java.util.Scanner;

public  class NumberPatter2{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    printpattern1(num);
  }
  public static void printpattern1(int num){
    int space=0;
    int star=2*num-1;
    for (int i = 1; i <=num; i++) {
        for(int j=1;j<=space;j++)
        System.out.print("  ");
        for(int j=1;j<=star;j++)
        System.out.print("* ");
        star-=2;
         space++;
         System.out.println();
    }
  }
}