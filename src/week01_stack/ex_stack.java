package week01_stack;

import java.util.Stack;

public class ex_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < 6; i++) {
            stack.push(i);
        }
        System.out.println("stack에 5가 들어있는 가? >> " + stack.contains(5));
        System.out.println("stack의 원소 5의 pop 순서? >> " + stack.search(5) + "번째");
        System.out.println("stack의 원소 1의 pop 순서? >> " + stack.search(1) + "번째");
        System.out.println("stack.size() = " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
