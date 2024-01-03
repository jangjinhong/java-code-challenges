package baekjun.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem25497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> lStack = new Stack<>();
        Stack<String> rStack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        String[] tech = br.readLine().split("");

        for(int i = 0; i < n; i++) {
            if(1 <= tech[i].charAt(0)-'0' && tech[i].charAt(0)-'0' <= 9)
                cnt++;
            else {
                if(tech[i].equals("L")) {
                    lStack.push(tech[i]);
                }
                if (tech[i].equals("S")) {
                    rStack.push(tech[i]);
                }
                if(tech[i].equals("R")) {
                    if(lStack.isEmpty()) break;
                    lStack.pop();
                    cnt++;
                }
                if(tech[i].equals("K")) {
                    if(rStack.isEmpty()) break;
                    rStack.pop();
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
