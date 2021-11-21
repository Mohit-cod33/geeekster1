import java.util.Scanner;

public class mulOfTwo_Num {
    static double multi(double a,double b){
//        float c=a*b;
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextFloat();
        double b=sc.nextFloat();
//        double c=multi(a,b);
        System.out.println(multi(a,b));
    }
}
