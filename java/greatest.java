package geekster;
import java.util.*;
public class greatest {
	public static void main(String []args) {
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("the largest number is: "+(a>(b>c?b:c)?a:(b>c?b:c)));
	}

}
