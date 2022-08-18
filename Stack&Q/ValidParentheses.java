import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        Stack<Character> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        boolean flg=true;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='(' || st.charAt(i)=='[' || st.charAt(i)=='{'){
                s.push(st.charAt(i));
            }
            else if(st.charAt(i)==')' || st.charAt(i)==']' || st.charAt(i)=='}'){
                char x=s.peek();
                if(x=='(' && st.charAt(i)==')' || x=='[' && st.charAt(i)==']' || x=='{' && st.charAt(i)=='}'){
                    s.pop();
                    continue;}
                else{
                    flg=false;
                    break;
                }
            }
        }
        if(flg==true){
            System.out.println("Balanced expression");
        }
        else
            System.out.println("UnBalanced expression");
    }
}
