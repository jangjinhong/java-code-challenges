package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1966_boj {
    /**
     * 메모리: 17108 KB
     *  시간: 176 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});

            int cnt = 0;
            while (!queue.isEmpty()) {
                int max = queue.peek()[1];
                for (int[] q : queue) max = Math.max(q[1], max);

                int[] poll = queue.poll();
                if(poll[1] < max) {
                    queue.offer(poll);
                }
                else {
                    cnt++;
                    if(poll[0] == m) break;
                }
            }

            System.out.println(cnt);
        }
    }
}

