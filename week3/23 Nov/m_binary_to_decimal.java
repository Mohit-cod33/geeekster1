package _String;

public class m_binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1001;
		int temp = num;
		int dec_value=0;
		int base = 1;
		while(temp>0)
		{
			int last_digit = temp%10;
			temp =temp/10;
			dec_value= dec_value + (base*last_digit);
			base = base*2;
		}
		System.out.println(dec_value);
	}

}
