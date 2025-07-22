import java.util.Scanner;

public class NumberPattern71 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    printpattern1(num);
  }
  public static void printpattern1(int num){
    // int space=0;
    int star=num;
    int count=num*(num+1)/2;
    for (int i = 1; i <=num; i++) {
        // for(int j=1;j<=space;j++)
        // System.out.print("  ");
        for(int j=1;j<=star;j++)
        System.out.print(count--+" ");
        star--;
        //  space++;
         System.out.println();
    }
  }
}

// 15 14 13 12 11 
// 10 9 8 7
// 6 5 4
// 3 2
// 1