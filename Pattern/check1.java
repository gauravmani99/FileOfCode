public class check1 {
    public static void main(String[] args) {
         int n=5;
        //  getcheck1(n);
        getcheck2(n);
    }
    public static void getcheck1(int n){
       
        int star=1;
        int space=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            star++;
            space--;
             System.out.println();
        }
    }
     public static void getcheck2(int n){
       
        int star=n;
        int space=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            star--;
            space++;
             System.out.println();
        }
    }
}
