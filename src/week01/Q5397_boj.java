package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q5397_boj {
    /**
     * 메모리 348096 kB
     * 시간 1828 ms
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Stack<String> leftStack = new Stack<>();
            Stack<String> rightStack = new Stack<>();
            String[] pw = br.readLine().split("");

            for (String p : pw) {
                switch (p) {
                    case "<":
                        if(!leftStack.isEmpty())
                            rightStack.push(leftStack.pop());
                        break;

                    case ">":
                        if(!rightStack.isEmpty())
                            leftStack.push(rightStack.pop());
                        break;

                    case "-":
                        if(!leftStack.isEmpty())
                            leftStack.pop();
                        break;

                    default:
                        leftStack.push(p);
                        break;
                }
            }

            while (!leftStack.isEmpty())
                rightStack.push(leftStack.pop());
            while (!rightStack.isEmpty())
                sb.append(rightStack.pop());
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
