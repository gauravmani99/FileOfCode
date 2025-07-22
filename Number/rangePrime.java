package Number;
import java.util.Scanner;
public class rangePrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first range");
        int start=sc.nextInt();
        System.out.println("Enter the ending range");
        int end=sc.nextInt();
        int i,j;
        for(i=start;i<=end;i++){
            int count =0;
            for(j=1;j<=i;j++){
              if(i%j==0){
                count++;
              }
            }
            if(count==2){
                System.out.println(i);
            }  
        }
    }
}
