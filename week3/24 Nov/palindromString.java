import java.util.Scanner;

public class palindromString {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String check = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            check += s.charAt(i);
        }
        if (check == s)
            System.out.println("String is palindrome");
        else
            System.out.println("Not a palindrome");
    }
}

