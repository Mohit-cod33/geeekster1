import java.util.Scanner;

public class greatTernary2 {
    public static int MaxOfTwo(int a,int b){
        return ((a>b)?a:b);
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Max among first two number is: "+MaxOfTwo(a,b));
    }
}
