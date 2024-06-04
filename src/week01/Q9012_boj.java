package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012_boj {
    /**
     * 메모리: 14304 KB
     *  시간: 112 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '(') {
                    stack.push('(');
                }
                else {
                    if (stack.isEmpty()) {
                        stack.push(')');
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            System.out.println(!stack.isEmpty() ? "NO" : "YES");
        }
    }
}
