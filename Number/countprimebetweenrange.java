package Number;

import java.util.Scanner;

public class countprimebetweenrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number Start :");
        int str=sc.nextInt();
        System.out.println("Enter the number End :");
        int end=sc.nextInt();
        int i,j;
        int count2=0;
        for(i=str;i<=end;i++){
            int count1=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count1 ++;
                }
            }
            if(count1==2){
                count2++;
            }
        }
        System.out.println(count2);
    }
}
