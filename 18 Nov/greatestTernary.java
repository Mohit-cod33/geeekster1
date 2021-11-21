import java.util.Scanner;

public class greatestTernary {
    public static int MaxOfThree(int a,int b, int c){
        return ((a>b)?a:b)>c?((a>b)?a:b):c;
    }
    public static void main(String []args){
        System.out.println("Please enter three numbers.....");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Maximum number is: "+MaxOfThree(a,b,c));
    }
}
