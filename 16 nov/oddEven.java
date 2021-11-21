import java.util.Scanner;

public class oddEven {
    public static void oddEven(int num){
        if(num%2==0)
            System.out.println(num+" is a even number");
        else
            System.out.println(num+" is a odd number");
    }
    public static void main(String []args){
        System.out.print("please enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        oddEven(num);
    }
}
