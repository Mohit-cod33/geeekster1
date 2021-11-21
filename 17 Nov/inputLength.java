import java.util.Scanner;

public class inputLength {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number..");
        String s= sc.next();
        if(s.length()<5)
            System.out.println("The length of the given number is: "+s.length());
        else
            System.out.println("The lengh of the given number is more than 5....");
    }
}
