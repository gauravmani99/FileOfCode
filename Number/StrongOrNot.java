// package Number;

import java.util.Scanner;

public class StrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num = sc.nextInt();
        System.out.println("Enter the end Number: ");
        int end = sc.nextInt();
        for(int i=num;i<=end;i++){
        getDigits(i); 
    }
}

    public static void getDigits(int num) {
        while (num > 0) {
            int rem = num % 10; 
            System.out.println(getfactorial(rem));
            num = num / 10; 
        }
    }

    public static int getfactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

// package Number;

// public class StrongOrNot {
//     public static void main(String[] args) {
//         int count = 0; 

//         System.out.println("Strong numbers up to 100:");

       
//         for (int i = 1; i <= 100; i++) {
//             if (isStrongNumber(i)) {
//                 System.out.println(i);
//                 count++; 
//             }
//         }

//         System.out.println("Total number of strong numbers up to 100: " + count);
//     }

    
//     public static boolean isStrongNumber(int num) {
//         int originalNumber = num;
//         int sum = 0;

       
//         while (num > 0) {
//             int digit = num % 10; 
//             sum += factorial(digit);
//             num = num / 10;
//         }

      
//         return sum == originalNumber;
//     }

//     // Method to calculate the factorial of a number
//     public static int factorial(int n) {
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact *= i;
//         }
//         return fact;
//     }
// }