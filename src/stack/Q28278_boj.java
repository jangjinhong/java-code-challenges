package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q28278_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++) {
            String[] x = br.readLine().split(" ");
            switch (x[0]) {
                case "1":
                    st.push(Integer.parseInt(x[1]));
                    break;
                case "2":
                    sb.append(!st.isEmpty() ? st.pop() : -1).append("\n");
                    break;
                case "3":
                    sb.append(st.size()).append("\n");
                    break;
                case "4":
                    sb.append(st.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "5":
                    sb.append(!st.isEmpty() ? st.peek() : -1).append("\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
