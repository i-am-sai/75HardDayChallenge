public class DLL   {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        int  val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;

        }
        head = node;
    }
    public void display(){
        Node temp = head;
          while(temp != null){
              System.out.print(temp.val + " => ");
              temp = temp.next;
          }
        System.out.println("END");
    }

    public void revDisplay(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + " => ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        while(last != null){
            System.out.print(last.val + " => ");
            last = last.prev;
        }
        System.out.println("START");
    }

    // If tail is not provided :
    public void inseretLast(int val){
        Node node = new Node(val);
        Node last  = head;
        node.next = null;
        if(head == null){
            node.prev = null;
         head = node;
         return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        System.out.println(node);
        return null;
    }
    public void insert(int after_index, int val){
        Node p = find(after_index);
        if(p == null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.InsertFirst(7);
        list.InsertFirst(9);
        list.InsertFirst(8);
        list.InsertFirst(6);
        list.revDisplay();
        list.inseretLast(4);
        list.display();
        list.insert(7,45);
        list.display();
    }
}
