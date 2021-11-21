import java.util.Scanner;

public class MaxMethod {
    public static int MaxOfTwo(int a,int b){
        return ((a>b)?a:b);
    }
    public static int MaxOfThree(int a,int b, int c){
        return ((a>b)?a:b)>c?((a>b)?a:b):c;
    }
    public static int MaxOfFour(int a,int b, int c,int d){
        return ((((a>b)?a:b)>c?((a>b)?a:b):c)>d?(((a>b)?a:b)>c?((a>b)?a:b):c):d);
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter four integer number:-");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int d= sc.nextInt();
        System.out.println("Max among first two number is: "+MaxOfTwo(a,b));
        System.out.println("Max among first three number is: "+MaxOfThree(a,b,c));
        System.out.println("Max among all four number is: "+MaxOfFour(a,b,c,d));
    }
}
