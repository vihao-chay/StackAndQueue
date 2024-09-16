package Queue;

import Stack.MyStack;

public class MyQueue {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        
    }
    private Node front;
    private Node rear;
    private int length;

    public MyQueue(){
        front = null;
        rear = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        // TH1 : Queue Null => front noi node dau tien
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
          rear.next = newNode;
        }
        rear = newNode;
        length++;
    }
    public int dequeue(){
        if(isEmpty()){
            return 0;
        }
        if(front == rear){
            front =rear = null;
            return 1;
        }
        Node temp = front;
        while(temp.next!=rear){
            temp=temp.next;
        }
        Node a = temp.next;
        temp.next=null;
        rear=temp;
        length--;
        return a.getData();
    }
    // dequeue(): remove front element and return data of removed element
// BTVN 1: 2 , 19 -> LeetCode
// BTVN 2: Implement Stack and Queue
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Queue length: " + queue.getLength());
        System.out.println(queue.dequeue());
    }

}
