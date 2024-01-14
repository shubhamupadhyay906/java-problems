package genericcollectionimpl.stack;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        Stack<Integer> stacks = new Stack<>();
        while (!stack.isEmpty()) {
            stacks.push(stack.pop());
        }
        System.out.println(stacks);

    }
}
