public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    private class Node {
        private int value;
        private Node next; // Complex objects by default value is null
        public Node(int value){
            this.value =value;
        }
        public Node(int value, Node next){
            this.value =value;
            this.next = next;
        }
    }

    public void insertionFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
size += 1;
    }

public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    System.out.println("END");
    }

public void insertionEnd(int val){
        if(tail == null){
            insertionFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
}

public void insert(int val, int index){
        if(index == 0){
            insertionFirst(val);
            return;
        }
        if(index == size){
            insertionEnd(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i< index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
}

public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
}

public Node get(int index){
        Node node = head;
        for(int i =0; i<index; i++){
            node = node.next;
        }
        return node;
}

public int deleteLast(){
     if(size <=1){
         return deleteFirst();
     }
     Node secondLast = get(size -2);
     int val = tail.value;
     tail = secondLast;
     tail.next = null;
     return val;
}

public int delete(int  index){
        if(index ==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
}
public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
    System.out.println(node);
        return null;
}
    public static void main(String[] args) {
        LL list = new LL();
        list.insertionFirst(4);
        list.insertionFirst(7);
        list.insertionFirst(5);
        list.display();
        list.insertionEnd(9);
        list.display();
        list.insert(3,2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(1);
        list.display();
        System.out.println( list.find(7));


    }

}
