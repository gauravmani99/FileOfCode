import java.util.Scanner;

public class primeBetweenrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lower value");
        int low=sc.nextInt();
        System.out.println("enter the lower Up");
        int up=sc.nextInt();
         System.out.print("Prime Number Are= :");
           for(int i=low;i<=up;i++){
      if(  checknum(i)){
        System.out.print(i+" ");
      }
    }
}
    public static boolean checknum(int num){
        if(num<=1){
        return false;
        }
        if(num==2||num==3){
        return true;
        }
        if(num%2==0){
            return  false;
        }
        for(int i=3;i*i<=num;i=i+2){
             if(num%i==0){
             return false;
             }
        }
        return true;
    } 
}
