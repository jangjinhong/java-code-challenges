package week01;

import java.io.IOException;
import java.util.Stack;

public class Q42584_programmers {
    public static void main(String[] args) throws IOException {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = solution(prices);

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }

    private static int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int N = prices.length;
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int pop = stack.pop();
                answer[pop] = i - pop;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int pop = stack.pop();
            answer[pop] = N - pop - 1;
        }

        return answer;
    }
}
