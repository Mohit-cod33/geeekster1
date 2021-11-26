package _String;

public class m_capital_firstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = "java is best".split(" " );
		
		for(String word: str)
		{
			System.out.print(Character.toString(word.charAt(0)).toUpperCase()+word.substring(1)+" ");
		}
	}

}
