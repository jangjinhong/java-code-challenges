package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] plane;   //간선 표시
    static boolean[] visited;
    static int N,M, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            result = 0;

            plane = new int[N + 1][N + 1];
            visited = new boolean[N + 1];

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                plane[a][b] = 1;
                plane[b][a] = 1;
            }

            bfs();
            sb.append(result - 1).append("\n"); //간선
        }
        
        System.out.println(sb);
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);   //시작 노드를 추가
        visited[1] = true;
        while (!queue.isEmpty()) {
            result++;
            int poll = queue.poll();
            for (int i = 0; i <= N; i++) {
                if (plane[poll][i] != 0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
