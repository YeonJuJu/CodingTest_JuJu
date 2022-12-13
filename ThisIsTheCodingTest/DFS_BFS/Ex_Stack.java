package DFS_BFS;

import java.util.Stack;

public class Ex_Stack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();

        System.out.println(stack.toString());
    }
}
