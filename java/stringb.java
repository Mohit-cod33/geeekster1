package geekster;
import java.util.*;
public class stringb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String [] stb =s.split(",");
		for(int i=0;i<stb[0].length();i++) {
			System.out.print(stb[0].charAt(i));
			for(int j=i;j<stb[1].length();j++) {
				System.out.print(stb[1].charAt(j));
				break;
			}
		}

	}

}
