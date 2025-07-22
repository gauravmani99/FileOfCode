
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        if(isHappyNumber(num)){
            System.out.println("number is happy Number");
        }
        else{
            System.out.println("number is not happ humber");
        }
    }
    public static boolean isHappyNumber(int num){
            while (num != 1 && num != 4) {
                num = getSquareSum(num);
            }
            return num == 1;
        }
    
    public static int getSquareSum(int num){
        int sum=0;int rem=0;
        while(num>0){
            rem=num%10;
            sum=sum+rem*rem;
            num=num/10;
        }
        return sum;
    }
}
