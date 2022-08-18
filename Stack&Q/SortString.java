import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ar[]=s.toCharArray();
        Arrays.sort(ar);
        Arrays.toString(ar);
        System.out.println(ar);

    }
}
