package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10828_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            String[] command = br.readLine().split(" ");
            switch(command[0]) {
                case "push":
                    stack.push(Integer.parseInt(command[1]));
                    break;

                case "pop":
                    sb.append(stack.isEmpty()? -1 : stack.pop()).append("\n");
                    break;

                case "size":
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty":
                    sb.append(stack.isEmpty()? 1 : 0).append("\n");
                    break;

                case "top":
                    sb.append(stack.isEmpty()? -1 : stack.lastElement()).append("\n");
                    break;

                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
