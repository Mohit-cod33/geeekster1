import java.util.Stack;

public class StackCollection {
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }
    }
}
