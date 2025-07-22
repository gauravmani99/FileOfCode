// package Pattern;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row");
        int row=sc.nextInt();
        getPlus(row);
    }
    public static void getPlus(int num){
        if(num%2==0){
			System.out.println("Number of Rows Must be Odd");
			return;
		}
		int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==mid || j==mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}


// for(int i=1;i<=num;i++){
//     for(int j=1;j<=num;j++){
//         if(i==mid || j==mid)
//             System.out.print("* ");
//         else
//             System.out.print("  ");
//     }
// System.out.println();
// }
// }
// }