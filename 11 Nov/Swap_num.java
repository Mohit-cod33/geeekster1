import java.util.*;
class Swap_num{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("num1= "+num1+"\nnum2="+num2);
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1= "+num1+"\nnum2="+num2);
	}
}