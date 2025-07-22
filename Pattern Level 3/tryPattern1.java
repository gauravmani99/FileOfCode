import java.util.Scanner;

public class tryPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        printPattern1(num);
    }

    public static void printPattern1(int num) {
        int star = num;
        int n = num * (num + 1) / 2; // Starting from the last number in the sequence
        int space = 0;
        
        for (int i = 0; i < num; i++) {
            // Print leading spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            
            if (i % 2 == 0) {
                // Even rows: print numbers in increasing order
                int startNum = n - star + 1;
                for (int j = 1; j <= star; j++) {
                    System.out.print(startNum++ + "\t");
                }
                n -= star; // Update n for the next row
            } else {
                // Odd rows: print numbers in decreasing order
                for (int j = 1; j <= star; j++) {
                    System.out.print(n-- + "\t");
                }
            }
            
            star--;
            space++;
            System.out.println();
        }
    }
}