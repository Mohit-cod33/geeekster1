import java.util.Scanner;

public class MethodsOfMulti {
    public static double firstMethod(int a,float b, long c){
        return (a*b*c);
    }
    public static double secondMethod(float b,int a, long c){
        return (a*b*c);
    }
    public static double thirdMethod(long c,int a,float b){
        return (a*b*c);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter int, float and long type number:-");
        int a=sc.nextInt();
        float b=sc.nextFloat();
        long c=sc.nextLong();
        System.out.println("Result of first method: "+firstMethod(a,b,c));
        System.out.println("Result of second method: "+secondMethod(b,a,c));
        System.out.println("Result of third method: "+thirdMethod(c,a,b));
    }
}
