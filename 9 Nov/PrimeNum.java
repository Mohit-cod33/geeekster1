import java.util.*;
class PrimeNum{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=0;
		if(num<2)
			System.out.println("It is not a valid number to check wheather it is prime or not");
		else{
			for(int i=2;i<num;i++){
				if(num%i==0)
					cnt++;
			}
		}
		if(cnt>0)
			System.out.println(num+" is not a prime number");
		else
			System.out.println(num+" is a prime number");
	}
}