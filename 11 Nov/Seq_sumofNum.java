import java.util.*;
class Seq_sumofNum{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0){
			System.out.println("Using forloop");
			int sum=0;
			for(int i=1;i<=num;i++){
				sum=sum+i;}
			System.out.println(sum);
	
			System.out.println("using while loop");
			int sm=0;
			int j=1;
			while(j<=num){
				sm=sm+j;
				j++;}
			System.out.println(sm);
		}
		
	}
}