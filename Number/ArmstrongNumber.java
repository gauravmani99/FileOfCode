// package Number;
// import java.util.Scanner;
// public class ArmstrongNumber {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num=sc.nextInt();
//         if(isArmstrong(num)){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
//     public static boolean isArmstrong(int num){
//         int originalNumber=num;
//         int rem=0;
//         int count=0;
//         int sum=0;
//         while (num > 0) {
//             num = num / 10;
//             count++;
//         }
//         num = originalNumber;
//         while(num>0){
//             rem=num%10;
//            sum=sum+ getpower(rem,count);
//             num=num/10;
//         }
//         return originalNumber==sum;
//     }
//     public static int getpower(int num, int power) {
//         return (int) Math.pow(num, power);
//     }
// }

// package Number;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static boolean isArmstrong(int num){
        int originalNumber=num;
        int rem=0;
        int count=0;
        int ams=0;
       
        while (num > 0) {
            num = num / 10;
            count++;
        }
       
        num = originalNumber;
        while(num!=0){
            rem=num%10;
            int mul=1;
            for(int i=1;i<=count;i++){
                mul=mul*rem;
            }
            ams=ams+mul;
            num=num/10;
        }
        return originalNumber==ams;
    }
    
}
