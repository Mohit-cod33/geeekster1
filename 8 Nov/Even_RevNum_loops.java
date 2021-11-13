import java.util.*;
class Even_RevNum_loops{
	public static void main(String []args){
		System.out.println("Print the Even number in reverse order");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Using forloop");
		if(num%2!=0){
			num=num-1;
		}
		for(int i=num;i<=2;i-2){
			System.out.println(i);
		}
		System.out.println("using while loop");
		while(num<=2){
			System.out.println(i);
			num=num-2;
		}
		
	}
}