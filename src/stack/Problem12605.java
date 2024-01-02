package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<String> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int i = 0;
        while(i++ < n) {
            String[] list = br.readLine().split(" ");
            for(String word : list)
                stack.push(word);

            sb.append("Case #"+ i +": ");
            sb.append(stack.pop());
            while(!stack.isEmpty())
                sb.append(" ").append(stack.pop());
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
