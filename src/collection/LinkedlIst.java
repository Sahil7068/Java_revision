package collection;

public class LinkedlIst {

    private Node head;

    class Node{
        int data; 
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void main(String[] args) {
        LinkedlIst ll = new LinkedlIst();
        
        Node first = new Node(10);
        ll.head = first;
    }

}
