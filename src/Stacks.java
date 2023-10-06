import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(7);
        stacks.push(8);
        stacks.push(9);
        System.out.println(stacks.size());
        System.out.println(stacks.peek());
        stacks.pop();
        System.out.println(stacks);
        System.out.println(stacks.empty());
    }
}
