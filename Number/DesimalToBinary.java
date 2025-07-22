import java.util.Scanner;

public class DesimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
       System.out.println( decimalToBinary(num));
    }
    public static String decimalToBinary(int num) {
        String binary = "";
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary; 
            num = num / 2;
        }
        return  binary;
    }
}
