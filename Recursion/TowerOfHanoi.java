package Recursion;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Disk");
    int num=sc.nextInt();
    char from='A' , aux='B',to='C';
    getTowerOfHanoi(num,from,to,aux);
}
public static  void getTowerOfHanoi(int num,char from,char to,char aux){
    if(num==1){
    System.out.println("Move  Disk From "+from+"to"+to);
    return;
    }
getTowerOfHanoi(num-1, from, aux, to);
System.out.println("Move  Disk From "+from+"to"+to);
getTowerOfHanoi(num-1, aux,to,from);
}
}