package genericcollectionimpl.stack;

import java.util.Stack;

public class StackAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(4, stack);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    public static void pushAtBottom(Integer value, Stack<Integer> stack){
        if (stack.isEmpty()){
            stack.push(value);
            return;
        }
        int top = stack.pop();//3/2/1
        pushAtBottom(value, stack);
        stack.push(top);
    }
}
