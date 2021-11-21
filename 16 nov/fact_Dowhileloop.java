import java.util.Scanner;

public class fact_Dowhileloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            int num=sc.nextInt();
            int fact=1;
            do{
                fact=fact*num;
                num--;
            }while(num!=1);
            System.out.println(fact);
            System.out.print("Do you want to continue....y/n:  ");
            char c=sc.next().charAt(0);
            if(c=='y')
                continue;
            else
                break;
        }while(true);
    }
}
