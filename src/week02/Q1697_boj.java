package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697_boj {
    static final int MAX_LOCATION = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        /**
         * bfs
         */
        if (N == K) {
            System.out.println(0);
            return;
        }

        boolean[] visited = new boolean[MAX_LOCATION + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{N, 0});
        visited[N] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int location = poll[0];
            int result = poll[1];

            int[] nLocation = {location - 1, location + 1, location * 2};

            for (int next : nLocation) {
                if (next == K) {
                    System.out.println(result + 1);
                    return;
                }

                if (next >= 0 && next <= MAX_LOCATION && !visited[next]) {
                    queue.add(new int[]{next, result + 1});
                    visited[next] = true;
                }
            }
        }
    }
}
