package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        int start = 1;

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(start <= num) {
                for(int j=start; j<=num; j++) {
                    st.push(j);
                    sb.append("+").append("\n");
                }
                start = num+1;
            }
            if(st.peek() != num) {
                System.out.println("NO");
                System.exit(0);
            }
            st.pop();
            sb.append("-").append("\n");
            System.out.println(st);
        }
        System.out.println(sb);

    }
}
