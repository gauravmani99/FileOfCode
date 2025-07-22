package Pattern;
import java.util.Scanner;
public class printthenameinStarForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string (letters A-Z): ");
        String input = sc.nextLine().toUpperCase();
        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                printPattern(c, 7); // Using size 7 for all patterns
                System.out.println("\n----------------------");
                
            }
        }
    }
    public static void printPattern(char c, int size) {
        switch (c) {
            case 'A': printpatternA(size); break;
            case 'B': printpatternB(size); break;
            case 'C': printpatternC(size); break;
            case 'D': printpatternD(size); break;
            case 'E': printpatternE(size); break;
            case 'F': printpatternF(size); break;
            case 'G': printpatternG(size); break;
            case 'H': printpatternH(size); break;
            case 'I': printpatternI(size); break;
            case 'J': printpatternJ(size); break;
            case 'K': printpatternK(size); break;
            case 'L': printpatternL(size); break;
            case 'M': printpatternM(size); break;
            case 'N': printpatternN(size); break;
            case 'O': printpatternO(size); break;
            case 'P': printpatternP(size); break;
            case 'Q': printpatternQ(size); break;
            case 'R': printpatternR(size); break;
            case 'S': printpatternS(size); break;
            case 'T': printpatternT(size); break;
            case 'U': printpatternU(size); break;
            case 'V': printpatternV(size); break;
            case 'W': printpatternW(size); break;
            case 'X': printpatternX(size); break;
            case 'Y': printpatternY(size); break;
            case 'Z': printpatternZ(size); break;
            default: System.out.println("No pattern available for character: " + c);
        }
    }

    // All your existing pattern methods remain exactly the same
    public static void printpatternA(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||j==num||i==mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternB(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||j==num||i==mid||i==num)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternC(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||i==num)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternD(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||i==num||j==num)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternE(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||i==num||i==mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternF(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||i==mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternG(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||i==num||i>mid&&j==num||j>mid&&i==mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternH(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1||j==num||i==mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternI(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||i==num||j==mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternJ(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==mid||i==1||i==num&&j<mid||j==1&&i>mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternK(int n){
		if(n%2==0){
			System.out.println("Pattern can't be generated for this n");
			return;
		}	
		int mid=n/2+1;
		int p=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=p;j++){
				if(j==1 || j==p)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		if(i<mid)
			p--; 
		else
			p++;
		System.out.println();
		}
	}

    public static void printpatternL(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1||i==num&&j<mid+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternM(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1||j==num||j==i&&j<mid&&i<mid||j==num||j == num - i + 1 && i <= mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternN(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1||j==num||i==j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternO(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1||j==num||i==1||i==num)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternP(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1||i==1&&j<mid+2||j==num&&i<mid+1||i==mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternQ(int n){
		if(n%2==0){
			System.out.println("Pattern can't be generated for this n");
			return;
		}	
		int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
	if(j==1 && i<n ||i==1 && j<n ||i==n-1 && j<n || j==n-1 && i<n ||i==j && i>=mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}

    public static void printpatternR(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1||i==1&&j<=mid||i==mid&&j<=mid||j==mid&&i<=mid||i>mid&&j==i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternS(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
               if(i==1||i==num||i==mid||j==1&&i<mid||j==num&&i>mid)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }

    public static void printpatternT(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==mid||i==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternU(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
               if(j==num||j==1||i==num)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternV(int n){
		if((n/2+1+1)%2==0){
			System.out.println("Pattern can't be generated for this n");
			return;
		}	
		int mid=n/2+1;
		int p=1, q=n;
		for(int i=1;i<=n;i+=2){
			for(int j=1;j<=q;j++){
				if(j==p || j==q)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		p++; q--;
		System.out.println();
		}
	}

    public static void printpatternW(int n) {
        // Ensure n is odd for proper symmetry
        if (n % 2 == 0) {
            System.out.println("Pattern can't be generated for even n");
            return;
        }
        
        int mid = n / 2 + 1;
        int left = 1, right = n;
        
        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (j == left && i > mid / 2 + 1) || (j == right && i > mid / 2 + 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            left++;
            right--;
            System.out.println();
        }
    }

    public static void printpatternX(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
               if(i==j||i+j==num+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternY(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
               if(i==j&&i<=mid&&j<=mid||i+j==num+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
    public static void printpatternZ(int num) {
        int mid=num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
              if(i==1||i==num||i+j==num+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
               System.out.println();
        }
    }
}
