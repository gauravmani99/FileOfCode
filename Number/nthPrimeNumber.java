package Number;
import java.util.Scanner;
public class nthPrimeNumber {
    public static boolean isPrime(int num){
       if(num<=1){
        return false;
       }
       if(num==2||num==3){
        return true;
       }
       if(num%2==0){
        return false;
       }
       for (int i = 3; i*i <=num; i++) {
           if(num%i==0)
           return false;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth tearm");
       int nth=sc.nextInt();
       int count=0;
       for(int i=1; ; i++){
        if(isPrime(i)){
            count++;
        if(count==nth){
            System.out.println(i);
            break;
        }
    }
    }
}

}
