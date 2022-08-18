import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void revStack(Stack<String> s){
        if(s.isEmpty()){
            return;
        }
        String top=s.pop();
        revStack(s);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<String> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        for(String i:st.split(" ")){
            s.push(i);
        }
        revStack(s);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
