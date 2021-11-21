import java.util.Scanner;

public class numOfDigiT {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number..");
        int num=sc.nextInt();
        int cnt=0;
        while(num!=0){
            cnt++;
            num=num/10;
        }
        System.out.println("There are "+cnt+" Digits in this number..");
    }
}
