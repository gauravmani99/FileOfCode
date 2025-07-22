package Pattern;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number");
        int num=sc.nextInt();
        // getSimplePattern(num);
        getHollowPattern( num);
    }
    // public static void getSimplePattern(int num){
    //     for(int i=1;i<=num;i++){
    //         for(int j=1;j<=num;j++){
    //         System.out.print("* ");
    //         }
    //         System.out.println(" ");
    //     }
    // }
    // public static void getHollow1Pattern(int num){
    //   for(int i=1;i<=num;i++){
    //       for(int j=1;j<=num;j++){
    //         if(i==1||i==num||j==1||j==num)
    //          System.out.print("* ");
          
    //       else
    //         System.out.print("  ");
          
    //     }
    //     System.out.println();
    //   }
    // }
    // public static void getHollow2Pattern(int num){
    //     for(int i=1;i<=num;i++){
    //         for(int j=1;j<=num;j++){
    //           if(i==1||j==1||i==num||j==num||i==num-1||j==num-1||i==2||j==2)
    //            System.out.print("* ");
            
    //         else
    //           System.out.print("  ");
            
    //       }
    //       System.out.println();
    //     }
    //   }


    public static void getHollowPattern(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
             
               System.out.print("("+i+","+j+")\t" );
            
          }
          System.out.println(" ");
        }
      }
}

