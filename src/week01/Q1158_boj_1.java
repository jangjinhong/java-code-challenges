package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1158_boj_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) queue.offer(i + 1);

        sb.append("<");
        int cnt = 1;
        while (queue.size() != 1) {
            int poll = queue.poll();
            if(cnt == K) {
                sb.append(poll).append(", ");
                cnt = 0;
            } else queue.offer(poll);
            cnt++;
        }
        sb.append(queue.poll()).append(">");

        System.out.println(sb);
    }
}
