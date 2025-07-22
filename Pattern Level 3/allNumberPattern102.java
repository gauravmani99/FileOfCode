import java.util.Scanner;

public class allNumberPattern102 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    // printpattern1(num);
    // printpattern2(num);
    // printpattern3(num);
    // printpattern4(num);
    printPattern5(num);
    // printpattern6(num);
  }
  public static void printpattern1(int num){
    // int space=0;
    int star=1;
    int n=1;
    for (int i = 1; i <=num; i++) {
        // for(int j=1;j<=space;j++)
        // System.out.print("  ");
        for(int j=1;j<=star;j++)
        System.out.print(n++ +" ");
       
        star++;	
        // space--;
         System.out.println();
    }
  }
//  1 
//  2 3
//  4 5 6
//  7 8 9 10
//  11 12 13 14 15

public static void printpattern2(int num){
   int space=0;
   int star=num;
   int n=1;
    for (int i = 1; i <=num; i++) {
        for(int j=1;j<=space;j++)
        System.out.print("\t");
        for(int j=1;j<=star;j++)
        System.out.print(n++ +"\t");
       
        star--;	space++;
         System.out.println();
    }
  }


// 1  2  3  4  
//    5  6  7  
//       8  9
//          10


public static void printpattern3(int num){
  int space=0;
  int star=num;
  int n=num*(num+1)/2;
   for (int i = 1; i <=num; i++) {
       for(int j=1;j<=space;j++)
       System.out.print("   ");
       for(int j=1;j<=star;j++)
       System.out.print(n-- +"  ");
      
       star--;	space++;
        System.out.println();
   }
 }


//  10  9  8  7  
//      6  5  4
//         3  2  
//            1


public static void printpattern4(int num){
  int space=0;
  int star=num;
  int n=num*(num+1)/2;
  int temp=n;
   for (int i = 1; i <=num; i++) {
       for(int j=1;j<=space;j++)
       System.out.print("   ");
       if(n%2==0){
       for(int j=1;j<=star;j++)
       System.out.print(n-- +"  ");
       }
      else
      for(int j=1;j<=star;j++)
      System.out.print(n++ +"  ");
       star--;	space++;
       n=temp;
        System.out.println();
   }
 }



 public static void printPattern5(int num) {
  int star = num;
  int n = num * (num + 1) / 2; 
  int space=0;
  for (int i = 1; i <= num; i++) {
  
      if (i % 2 == 0) {
          int start = n - star + 1;
          for (int j = 1; j <= star; j++) {
              System.out.print(start++ + "  ");
          }
          n = n - star;
      } else {
       
          for (int j = 1; j <= star; j++) {
              System.out.print(n-- + "  ");
          }
      }
      star--;
      System.out.println();
  }
}

// 15  14  13  12  11  
// 7  8  9  10
// 6  5  4  
// 2  3
// 1

public static void printpattern6(int num) {
  int star = num;
  int n = num * (num + 1) / 2; 
  
  for (int i = 1; i <= num; i++) {
      if (i % 2 != 0) {
          int start = n - star + 1;
          for (int j = 1; j <= star; j++) {
              System.out.print(start++ + "  ");
          }
          n = n - star;
      } else {
       
          for (int j = 1; j <= star; j++) {
              System.out.print(n-- + "  ");
          }
      }
      star--;
      System.out.println();
  }
}

// 11  12  13  14  15  
// 10  9  8  7  
// 4  5  6  
// 3  2  
// 1  
}