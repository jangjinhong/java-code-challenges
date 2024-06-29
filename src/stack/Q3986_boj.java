package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q3986_boj {
    /**
     * 메모리: 19588 KB ( / 256000 KB)
     *  시간: 276 ms    ( / 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N-- > 0) {
            String str = br.readLine();
            stack.push(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);
                if (stack.isEmpty() || stack.peek() != c) {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }

            if(stack.isEmpty()) cnt++;
            else stack.clear();
        }

        System.out.println(cnt);
    }
}
