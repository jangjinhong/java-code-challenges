package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9093_boj {
    /**
     * 메모리 82676 kB
     * 시간 668 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine() + "\n";
            for (Character c : str.toCharArray()) {
                if (c == ' ' || c == '\n') {
                    while (!stack.isEmpty())
                        sb.append(stack.pop());
                    sb.append(c);
                } else {
                    stack.push(c);
                }
            }
        }

        System.out.println(sb);
    }
}
