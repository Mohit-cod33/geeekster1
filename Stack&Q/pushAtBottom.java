import java.util.Stack;
import java.util.*;
public class pushAtBottom {
    public static void pushAtbotom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbotom(data,s);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(3);
        s.push(2);
        pushAtbotom(4,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
