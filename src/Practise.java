import java.util.LinkedList;

public class Practise {

    private Node head;
    private Node tail;

    // A basic LL class : characterisitc
    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        
    }

}