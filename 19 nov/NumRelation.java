import java.util.Scanner;

public class NumRelation {
    public static void Relation(int a,int b){
        if(a==b)
            System.out.println("Both are the same number..");
        else if(a>b)
            System.out.println(a+" is greater than "+b+" ...");
        else
            System.out.println(b+" is greater than "+a+" ...");
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Relation(a,b);
    }
}
