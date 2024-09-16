package Stack;

public class MyStack {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    private Node top;
    private int length;
    public MyStack(){
        top = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }
    public int pop(){
        int a;
        if(isEmpty()){
            return 0;
        }
        else if(getLength()==1){
            top=null;
            return top.data;
        }
        else{
            a = top.data;
            top=top.next;
        }
        length--;
        return a;
    }
    public Object pop1() {
        if(isEmpty()) return null;
        int res = top.data;
        top = top.next;
        length--;
        System.out.println("Removed element: " + res);
     return res;
    }
    // pop(): remove top element and return data of removed element
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(7);
        stack.push(6);
        System.out.println(stack.getLength());
        System.out.println(stack.pop());

    }
}   
