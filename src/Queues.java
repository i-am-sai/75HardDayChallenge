import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class Queues {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(7);
//        queue.add(3);
//        queue.add(6);
//        queue.add(2);
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue);
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(77);
        deque.addLast(67);
        deque.addFirst(13);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
