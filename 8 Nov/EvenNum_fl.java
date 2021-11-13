import java.util.*;
class EvenNum_fl{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Using forloop");
		for(int i=2;i<=num;i+2){
			System.out.println(i);
		}
		System.out.println("using while loop");
		int j=2;
		while(i<=num){
			System.out.println(i);
			i=i+2;
		}
		
	}
}