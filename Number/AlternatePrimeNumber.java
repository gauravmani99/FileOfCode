package Number;
import java.util.Scanner;
public class AlternatePrimeNumber {
    public static boolean isPrime(int n){
     if(n<=1){
        return false;
     }
        if(n==2||n==3){
            return true;
        }
        if(n%2==0){
                return false;
        }
        for(int i=3;i*i<=n;i++){
             if(n%i==0)
                return false;
             
        }
        return true;
     
    }
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range: ");
		int n=sc.nextInt();

		int count=0;
		for(int i=1;i<=n;i++){
			if(isPrime(i)){
				count++;
				if(count%2==1){
					System.out.print(i+" ");
				}
				
			}
		}
	}
}
