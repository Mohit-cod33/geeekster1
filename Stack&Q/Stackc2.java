public class Stackc2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static class Stack{
        public static boolean isEmpty(){
            return head==null;
        }
        public static Node head;
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.peek());
    }
}
