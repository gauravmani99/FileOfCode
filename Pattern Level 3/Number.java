
import java.util.Scanner;

public  class Number{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    printpattern1(num);
  }
  public static void printpattern1(int num){
    int space=num-1;
    int star=1;
    for (int i = 1; i <=num; i++) {
        for(int j=1;j<=space;j++)
        System.out.print("  ");
        for(int j=1;j<=star;j++)
        System.out.print(i+" ");
        star++;
         space--;
         System.out.println();
    }
  }
}

// 1 
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5