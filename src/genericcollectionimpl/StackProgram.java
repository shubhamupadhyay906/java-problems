package genericcollectionimpl;

import java.util.ArrayList;
import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
