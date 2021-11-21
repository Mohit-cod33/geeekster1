import java.util.Scanner;

public class userOperation {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a=sc.nextInt();
        System.out.print("Please enter second number: ");
        int b=sc.nextInt();
        System.out.print("Please select any one of (+,-,/,%,*) these operator to perform a operation: ");
        char op=sc.next().charAt(0);
        if(op=='+')
            System.out.println("your result "+a+"+"+b+"= "+(a+b));
        else if(op=='-')
            System.out.println("your result "+a+"-"+b+"= "+(a-b));
        else if(op=='/')
            System.out.println("your result "+a+"/"+b+"= "+((float)a/b));
        else if(op=='*')
            System.out.println("your result "+a+"*"+b+"= "+(a*b));
        else
            System.out.println("your result "+a+"%"+b+"= "+(a%b));
    }
}
