import java.util.*;
class FactNum{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int factl=1;
		for(int i=num;i>=1;i--){
			factl=factl*i;
		}
		System.out.println(factl);
	}
}